package by.future.it.javacourse.lesson6.arrays;

public class TheBiggestNumberInArray {
	
	public static void main(String[] args) {
		long massiv[] = {2,3,5,8,0,7};
		long maxValue = massiv[0];
		long sum = 0;
		for (int i = 0;  i < massiv.length; i++) {
			if (massiv[i] > maxValue) {
				maxValue = massiv[i];
			}
			sum+=massiv[i];
		}
		
		
		System.out.println(maxValue);
		System.out.println(((double)sum)/(massiv.length));
	}
}
