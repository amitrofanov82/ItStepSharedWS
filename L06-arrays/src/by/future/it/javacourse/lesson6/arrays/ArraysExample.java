package by.future.it.javacourse.lesson6.arrays;

public class ArraysExample {
	public static void main(String[] args) {
		//type varName[];
		//type[] varName;
		
		int arrayOfInt[];
		int[] arrayOfInt2;
		
		int a, arrayOfInteger[] = {2,3,4}, c, d[];
		int[] a2, b2, c2[], d2;
		
		boolean isPrime;
		
		//b = {2,3,4};
		
		System.out.println(arrayOfInteger[0]);
		arrayOfInteger[0] = arrayOfInteger[1] * 2;
		System.out.println(arrayOfInteger[0]);
		System.out.println(arrayOfInteger.length);
		
		for (int i = 0; i < arrayOfInteger.length; i++) {
			System.out.println("idx="+i + "value="+arrayOfInteger[i]);
		}
		
		
	}
}
