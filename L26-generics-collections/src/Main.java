
public class Main {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();

		Object o1 = new Human(15);
		Object o2 = new Human(30);
		Object o3 = new Human(9);
		Object o4 = new Human(18);
		Object o5 = new Human(42);
		Object o6 = new Human(13);
		Object o7 = new Human(5);
		Object o8 = new Human(16);
		Object o9 = new Human(22);

		tree.add(o1);
		tree.add(o2);
		tree.add(o5);
		tree.add(o6);
		tree.add(o1);
		tree.add(o8);
		tree.add(o9);

		tree.remove(o1);
		tree.remove(o1);
		tree.remove(o9);

		System.out.println(tree.contains(o1));
		System.out.println(tree.contains(o2));
		System.out.println(tree.contains(o3));
		System.out.println(tree.contains(o4));
		System.out.println(tree.contains(o5));
		System.out.println(tree.contains(o6));
		System.out.println(tree.contains(o7));
		System.out.println(tree.contains(o8));
		System.out.println(tree.contains(o9));

		System.out.println("size = " + tree.size());

		System.out.println("first = " + tree.getFirst());
		System.out.println("last = " + tree.getLast());

		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		System.out.println(tree.next());
		
		
		System.out.println("--------- TRAVERSAL: --------------");
		tree.printWholeTree();
	}
}
