package lesson27.generics;
import java.io.File;
import java.util.Comparator;

public class TreeSet<T> extends File implements OrderedSet<T> {

	private Element<T> root;
	private Element<T> currentNext;
	private int size;
	private Comparator<T> comp;

	public TreeSet() {
		super("asdasd");
		size = 0;
	}
	
	public TreeSet(Comparator comp) {
		super("asdasd");
		size = 0;
		this.comp = comp;
	}

	@Override
	public void add(T o) {
		Element<T> exm = new Element();
		exm.object=o;
		if (root == null) {
			root = exm;
			size++;
		} else if (!contains(o)) {
			Element<T> currentExm = root;
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
	public void remove(T o) {
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
		
		
		Element<T> currentExm = root;
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
					Element<T> change = currentExm.right;
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
					Element<T> change = currentExm.left;
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
	public boolean contains(T o) {
		Element<T> currentExm = root;
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
	public T getFirst() {
		if (size == 0) {
			return null;
		}
		Element<T> currentExm = root;
		while (currentExm.left != null) {
			currentExm = currentExm.left;
		}
		return currentExm.object;
	}

	@Override
	public T getLast() {
		if (size == 0) {
			return null;
		}
		Element<T> currentExm = root;
		while (currentExm.right != null) {
			currentExm = currentExm.right;
		}
		return currentExm.object;
	}

	@Override
	public T next() {
		if (size == 0) {
			return null;
		}
		if (currentNext == null) {
			Element<T> tmp = root;
			while (tmp.left != null) {
				tmp = tmp.left;
			}
			currentNext = tmp;
			return currentNext.object;
		} else if (size == 1) {
			return currentNext.object;
		} else {
			Element<T> step = currentNext;
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
	public T prev() {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	private boolean compare(T o, T current) {
		if (comp != null){
			return (comp.compare(o, current) < 0) ;
		}
		
		if (((Comparable) o).compareTo(current) < 0) {
			return true;
		} else {
			return false;
		}

	}

	private Element<T> search(T o) {
		Element<T> currentExm = root;
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
	
	private static class Element<E> {
		E object;
		Element<E> parent;
		Element<E> left;
		Element<E> right;
		
		public boolean isList() {
			return this.left == null && this.right == null;
		}
	}

	public void printWholeTree(){
		traverseTreeAndPrintIt(root);
	}
	private void traverseTreeAndPrintIt(Element<T> root){

		if (root.left != null) {
			traverseTreeAndPrintIt(root.left);
		}
		System.out.println(root.object);
		if (root.right != null) {
			traverseTreeAndPrintIt(root.right);
		}
		
	}
	
	
}
