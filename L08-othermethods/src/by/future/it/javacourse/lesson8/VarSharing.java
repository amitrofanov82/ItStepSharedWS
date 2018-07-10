package by.future.it.javacourse.lesson8;

public class VarSharing {

	public static void main(String[] args) {
		int a = 10;
		changeA(a);
		System.out.println(a);
		
		char[] arr = {'A','B','C'};
		changeArr(arr);
		System.out.println(arr);
		
		char[] arr2 = {'A','B','C'};
		changeArr2(arr2);
		System.out.println(arr);
	}

	private static void changeArr2(char[] arr2) {
		char[] newArr2 = new char[arr2.length];
		for (int i = 0; i < newArr2.length; i++) {
			newArr2[i] = arr2[i];
		}
		arr2 = newArr2;
		arr2[0]='B';
	}

	private static void changeArr(char[] arr) {
		arr[0]='B';
	}

	private static void changeA(int a) {
		a = a + 1;
	}

}
