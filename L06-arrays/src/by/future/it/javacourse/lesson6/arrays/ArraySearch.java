package by.future.it.javacourse.lesson6.arrays;

public class ArraySearch {
	public static void main(String[] args) {
		int array[] = {3,4,6,7,8,9,34,44,75,125};
		int searchNumber = 123;
		
		boolean answer = false;
		int L = 0;
		int R = array.length-1;
		
		while (R>L) {
			System.out.println(L + " " + R);
			int M = (L+R)/2;
			if (searchNumber == array[M]) {
				answer = true;
				break;
			}
			if (searchNumber > array[M]) {
				//ищем справа
				L=M;
			} else {
				R=M;
			}
			if ((R-L) == 1) {
				answer = searchNumber == array[R] 
						|| searchNumber == array[L];
				break;
			}
		}
		

		
		
		if (answer) {
			System.out.println("aga");
		} else {
			System.out.println(":o(");
		}
		
		
		
	}
}
