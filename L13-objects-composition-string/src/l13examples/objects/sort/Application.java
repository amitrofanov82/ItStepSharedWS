package l13examples.objects.sort;

public class Application {
	
	public static void main(String[] args) {
		Human[] narod = new Human[20];
		
		for (int i=0; i<narod.length; i++){
			narod[i] = new Human();
		}
		
		for (int i=0; i<narod.length; i++){
			for (int j=i+1; j<narod.length; j++){
				//if (narod[i].age > narod[j].age) {
				if (compareByName(narod[i], narod[j]) > 0) {
					Human temp = narod[i];
					narod[i] = narod[j];
					narod[j] = temp;
				}
			}
		}
		
		for (int i=0; i<narod.length; i++){
			narod[i].printMe();
		}
		
	}
	
	private static int compareByName(Human h1, Human h2) {
		/*char[] h1Chars = h1.name.toCharArray();
		char[] h2Chars = h2.name.toCharArray();
		
		if (h1Chars[0] > h2Chars[0]) {
			return 1;
		} else if (h1Chars[0] == h2Chars[0]) {
			return 0;
		} else {
			return -1;
		}*/
		return h1.name.compareTo(h2.name);

	}

}
