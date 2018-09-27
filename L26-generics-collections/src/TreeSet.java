import java.util.Comparator;

public class TreeSet implements OrderedSet {

	private Element root;
	private Element currentNext;
	private int size;
	private Comparator comp;

	public TreeSet() {
		size = 0;
	}
	
	public TreeSet(Comparator comp) {
		size = 0;
		this.comp = comp;
	}

	@Override
	public void add(Object o) {
		Element exm = new Element();
		exm.object=o;
		if (root == null) {
			root = exm;
			size++;
		} else if (!contains(o)) {
			Element currentExm = root;
			while (true) {
				if (compare(o, currentExm.object)) {
					if (currentExm.left == null) {
						currentExm.left = exm;
						exm.parent = currentExm;
						size++;
						break;
					} else {
						currentExm = currentExm.left;
						continue;
					}
				} else {
					if (currentExm.right == null) {
						currentExm.right = exm;
						exm.parent = currentExm;
						size++;
						break;
					} else {
						currentExm = currentExm.right;
						continue;
					}
				}
			}
		}
	}

	@Override
	public void remove(Object o) {
		/*Element delMe = search(o);
		if (delMe == null) {
			return;
		}
		if (delMe.isList()){
			if (delMe.parent.left == delMe) {
				delMe.parent.left = null; 
			} else {
				delMe.parent.right = null; 
			}
			size--;
			delMe.parent = null;
			return;
		}
		
		if (delMe.right != null) {
			//replace delMe with getFirst(delMe.right)
		} else {
			//replace delMe with getLast(delMe.left)
		}
		remove(delMe);*/
		
		
		Element currentExm = root;
		while (currentExm != null) {
			if (o.equals(currentExm.object)) {
				if (currentExm.left == null && currentExm.right == null) {
					if (currentExm.parent == null) {
						root = null;
						size--;
						break;
					} else {
						if (compare(currentExm.object, currentExm.parent.object)) {
							currentExm.parent.left = null;
							size--;
							break;
						} else {
							currentExm.parent.right = null;
							size--;
							break;
						}
					}
				} else if (currentExm.left == null) {
					Element change = currentExm.right;
					while (change.left != null) {
						change = change.left;
					}
					currentExm.object = change.object;
					if (compare(change.object, change.parent.object)) {
						change.parent.left = change.right;
					} else {
						change.parent.right = change.right;
					}
					size--;
					break;
				} else {
					Element change = currentExm.left;
					while (change.right != null) {
						change = change.right;
					}
					currentExm.object = change.object;
					if (!compare(change.object, change.parent.object)) {
						change.parent.left = change.left;
					} else {
						change.parent.right =change.left;
					}
					size--;
					break;
				}
			} else {
				if (compare(o, currentExm.object)) {
					currentExm = currentExm.left;
				} else {
					currentExm = currentExm.right;
				}
			}
		}
	}

	@Override
	public boolean contains(Object o) {
		Element currentExm = root;
		while (currentExm != null) {
			if (o.equals(currentExm.object)) {
				return true;
			} else {
				if (compare(o, currentExm.object)) {
					currentExm = currentExm.left;
				} else {
					currentExm = currentExm.right;
				}
			}
		}
		return false;
	}

	@Override
	public Object getFirst() {
		if (size == 0) {
			return null;
		}
		Element currentExm = root;
		while (currentExm.left != null) {
			currentExm = currentExm.left;
		}
		return currentExm.object;
	}

	@Override
	public Object getLast() {
		if (size == 0) {
			return null;
		}
		Element currentExm = root;
		while (currentExm.right != null) {
			currentExm = currentExm.right;
		}
		return currentExm.object;
	}

	@Override
	public Object next() {
		if (size == 0) {
			return null;
		}
		if (currentNext == null) {
			Element tmp = root;
			while (tmp.left != null) {
				tmp = tmp.left;
			}
			currentNext = tmp;
			return currentNext.object;
		} else if (size == 1) {
			return currentNext.object;
		} else {
			Element step = currentNext;
			while (true) {
				if (step.right != null && compare(currentNext.object, step.right.object)) {
					step = step.right;
					while (step.left != null) {
						step = step.left;
					}
					currentNext = step;
					return currentNext.object;
				} else {
					if (currentNext.parent == null) {
						Element tmp = currentNext.right;
						while (tmp.left != null) {
							tmp = tmp.left;
						}
						currentNext = tmp;
						return currentNext.object;
					} else if (step.parent == null) {
						currentNext = null;
						next();
						return currentNext.object;
					}
					step = step.parent;
					if (compare(currentNext.object, step.object)) {
						currentNext = step;
						return currentNext.object;
					}
				}
			}
		}
	}

	@Override
	public Object prev() {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	private boolean compare(Object o, Object current) {
		if (comp != null){
			return (comp.compare(o, current) < 0) ;
		}
		
		if (((Human) o).compare(current) < 0) {
			return true;
		} else {
			return false;
		}

	}

	private Element search(Object o) {
		Element currentExm = root;
		while (currentExm != null) {
			if (o.equals(currentExm.object)) {
				return currentExm;
			} else {
				if (compare(o, currentExm.object)) {
					currentExm = currentExm.left;
				} else {
					currentExm = currentExm.right;
				}
			}
		}
		return null;
	}
	
	private static class Element {
		Object object;
		Element parent;
		Element left;
		Element right;
		
		public boolean isList() {
			return this.left == null && this.right == null;
		}
	}

	public void printWholeTree(){
		traverseTreeAndPrintIt(root);
	}
	private void traverseTreeAndPrintIt(Element root){

		if (root.left != null) {
			traverseTreeAndPrintIt(root.left);
		}
		System.out.println(root.object);
		if (root.right != null) {
			traverseTreeAndPrintIt(root.right);
		}
		
	}
	
	
}
