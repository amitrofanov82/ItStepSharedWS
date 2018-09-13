package lesson22.functionalInterface;

public class SortingApp {
	
	
	public static void main(String[] args) {
		Stone[] stones= new Stone[10];
		Human[] people= new Human[10];
		Cat[] cats= new Cat[10];
		
		Sravnivaemyj cat = new Cat();
		//Comparable cat2 = new Comparable();
		
		for (int i=0; i<stones.length; i++){
			stones[i] = new Stone();
		}
		for (int i=0; i<people.length; i++){
			people[i] = new Human();
		}
		for (int i=0; i<cats.length; i++){
			cats[i] = new Cat();
		}
		
		printAll(stones, people, cats);

		sort(stones);
		sort(people);
		sort(cats);
		
		printAll(stones, people, cats);
	}
	
	static void sort(Sravnivaemyj[] objectsToSort){
		//if (o instanceof Stone[]) {
			//Stone[] st = (Stone[]) o;
		//}
		
		for (int i = 0; i < objectsToSort.length; i++) {
			for (int j = i; j < objectsToSort.length; j++) {
				if (objectsToSort[i].compare(objectsToSort[j]) > 0) {
					//replace
					Sravnivaemyj temp = objectsToSort[i];
					objectsToSort[i] = objectsToSort[j];
					objectsToSort[j] = temp;
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	
	private static void printAll(Stone[] stones, Human[] people, Cat[] cats) {
		for (Object o : stones) {
			System.out.println(o);
		}
		System.out.println("---------");
		for (Object o : people) {
			System.out.println(o);
		}
		System.out.println("---------");
		for (Object o : cats) {
			System.out.println(o);
		}
		System.out.println("---------");
		System.out.println("КОНЕЦ ВЫВОДА");
		System.out.println("---------");
	}

}
