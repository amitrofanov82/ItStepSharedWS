package by.future.it.javacourse.lesson8;

public class Recursive {
	public static void main(String[] args) {
		int N = 100;
		System.out.println(sum1toN(N));
	}

	private static int sum1toN(int n) {
		if (n==1){
			return 1;
		}
		return (n + sum1toN(n-1));
	}
}










