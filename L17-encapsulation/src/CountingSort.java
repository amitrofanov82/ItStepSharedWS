
public class CountingSort {
	
	
	
	public static void main(String[] args) {
		
		int newArraylength = 15;
		
		String[] array = createNewRandomStringArray(newArraylength);
		printArray (array);
		sortTripleStringArray(array);
		System.out.println("sorted array:");
		printArray (array);

	}

	private static void printArray (String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		System.out.println();
	}

	private static void sortTripleStringArray(String[] array) {
		int[] sort = new int[95000];
		int idxArray = 0;
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			n = turnFromStringToInt(array[i]);
			sort[n]++;
			
		}
		for (int i = 0; i < sort.length; i++) {
			while (sort[i] != 0) {
				array[idxArray] = turnFromIntToString(i);
				idxArray++;
				sort[i]--;
			}
		}
	}


	
	public static String [] createNewRandomStringArray (int n) {
		
		String [] newArray = new String [n];
		
		for (int i = 0; i<newArray.length; i++) {
			char letter1 = (char)(97+(int)(Math.random()*25));
			char letter2 = (char)(97+(int)(Math.random()*25));
			char letter3 = (char)(97+(int)(Math.random()*25));
			newArray [i]  = ""+letter1+letter2+letter3;
			
		}
		
		return newArray;
	}

	public static int turnFromStringToInt(String t) {

		int n = ((((int) (t.charAt(0)))-96) * 3500 + (((int) (t.charAt(1)))-96) * 125 + (((int) (t.charAt(2)))-96));
		return n;
		
	}

	public static String turnFromIntToString(int n){
		int helpNumber1 = n/3500;
      		int helpNumber2 = (n-helpNumber1 *3500)/125;
      		int helpNumber3 = (n-helpNumber1*3500-helpNumber2*125);
      		char letter1 = (char)(helpNumber1 + 96);
		char letter2 = (char)(helpNumber2 + 96);
		char letter3 = (char)(helpNumber3 + 96);
		String t = ""+letter1+letter2+letter3;
		return t;
	}

}




























