package lesson22_24.functionalInterface;

public class SortingApp {
	
	
	public static void main(String[] args) {
		Stone[] stones= new Stone[10];
		Human[] people= new Human[10];
		Cat[] cats= new Cat[10];
		Object[] objects = new Object[30];
		
		for (int i=0; i<stones.length; i++){
			stones[i] = new Stone();
			objects[i] = stones[i];
		}
		for (int i=0; i<people.length; i++){
			people[i] = new Human();
			objects[10 + i] = people[i];
		}
		for (int i=0; i<cats.length; i++){
			cats[i] = new Cat();
			objects[20 + i] = cats[i];
		}
		
		//printAll(stones, people, cats);


		
		Sravnivatel sravKotov = new Sravnivatel(){

			@Override
			public int sravni(Object o1, Object o2) {
				return ((Cat) o1).dlinaHvosta - ((Cat) o2).dlinaHvosta;
			}
			
		};
		//System.out.println(sravKotov.getClass());
		sort(cats, sravKotov);
		
		
		sort(people, (o1,o2) -> {
			int result = ((Human) o1).name.compareTo(((Human) o2).name);
			return result;
		});
		
		
		Sravnivatel sravnKamnej = (o1,o2) -> {
			int result = ((Stone) o1).forma.compareTo(((Stone) o2).forma);
			return result;
		};
		System.out.println(sravnKamnej.getClass());
		sort(stones, sravnKamnej);
		
		
		sort(objects, new UniversalSravnivatel());
		
		printAll(stones, people, cats, objects);
	}
	
	static void sort(Object[] objectsToSort, Sravnivatel sravnivatel){
		for (int i = 0; i < objectsToSort.length; i++) {
			for (int j = i+1; j < objectsToSort.length; j++) {
				if (sravnivatel.sravni(objectsToSort[i], objectsToSort[j]) > 0) {
					//replace
					Object temp = objectsToSort[i];
					objectsToSort[i] = objectsToSort[j];
					objectsToSort[j] = temp;
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	
	private static void printAll(Stone[] stones, Human[] people, Cat[] cats, Object[] objects) {
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
		for (Object o : objects) {
			System.out.println(o);
		}
		System.out.println("---------");
		System.out.println("КОНЕЦ ВЫВОДА");
		System.out.println("---------");
	}

}
