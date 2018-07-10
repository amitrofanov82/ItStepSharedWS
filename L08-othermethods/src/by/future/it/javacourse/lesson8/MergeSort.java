package by.future.it.javacourse.lesson8;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[100000]; 
		mergeSort(array);
		printArray(array);
		
		
	}



	private static void mergeSort(int[] array) {
		if (array.length == 1) {
			return;
		}
		int m = (array.length-1)/2;
		int[] left = new int[m+1];
		int[] right = new int[array.length - m -1];
		for (int i = 0; i<left.length; i++ ) {
			//TODO fill left
		}
		for (int i = 0; i<right.length; i++ ) {
			//TODO fill right
		}
		mergeSort(left);
		mergeSort(right);
		mergeArrays(array, left, right);
		
	}
	
	private static void mergeArrays(int[] array, int[] left, int[] right) {
		// TODO we have already done it
		
	}



	private static void printArray(int[] array) {
		// TODO
	}
}
