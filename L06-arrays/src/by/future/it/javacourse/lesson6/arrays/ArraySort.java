package by.future.it.javacourse.lesson6.arrays;

public class ArraySort {
	public static void main2(String[] args) {
		long massiv[] = {2,3,5,8,-10,7};
		long massiv2[] = {0,0,0,0,0,0};
		
		for (int j = 0;  j < massiv.length; j++) {
			long minValue = massiv[0];
			int minIdx = 0;
			for (int i = 0;  i < massiv.length; i++) {
				if (massiv[i] < minValue) {
					minValue = massiv[i];
					minIdx = i;
				}
			}
			massiv[minIdx] = 1000000;
			massiv2[j] = minValue;
		}

		
		for (int i = 0;  i < massiv.length; i++) {
			System.out.print(massiv2[i] + " | ");
		}
	}

	public static void main(String[] args) {
		long massiv[] = {2,3,5,8,-10,7};
		
		for (int i = 0;  i < massiv.length; i++) {
			for (int j=i; j< massiv.length; j++) {
				if (massiv[i] < massiv[j]) {
					long temp = massiv[j];
					massiv[j] = massiv[i];
					massiv[i] = temp;
				}
			}
		}

		for (int i = 0;  i < massiv.length; i++) {
			System.out.print(massiv[i] + " | ");
		}
	}

}
















