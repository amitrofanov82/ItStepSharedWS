package lesson27.generics;


public class GenericClasses {
	
	public static void main(String[] args) {
		OrderedSet<Human> hTree = new TreeSet<Human>();
		OrderedSet<String> sTree = new TreeSet<String>();

		Human h1 = new Human(15);
		hTree.add(h1);
		//tree.add("нечеловек");
		
		Human h2 = hTree.prev();
		Human h3 = hTree.next();
		
		System.out.println(h3);
		
		
		
		sTree.add("asdasf");
		sTree.add("qweasf");
		sTree.add("asaasdasdasf");
		sTree.add("qwdasf");
		sTree.add("zxdasf");
		sTree.add("ytdasf");
		((TreeSet) sTree).printWholeTree();
		
		TreeSet<String> o1 = new TreeSet<>();
		TreeSet<Human> o2 = new TreeSet<Human>();
		TreeSet<Female> o3 = new TreeSet<>();
		
		System.out.println(o2.getClass() == o1.getClass());
		o1 = (TreeSet) o2;
		o1.add("asdhgajsdg");
		o2 = (TreeSet) o1; 
		//Human o3 = o2.next();
		System.out.println(o3.getClass());
		
		Object o10;
		Human h10 = null;
		Female f10 = null;
		//<Female> genericMethod(f10);
		
	}
	
	
	static <M extends Human> M genericMethod(M param){
		Object o = new Female(1);
		return (M) o;
	}
	
}










