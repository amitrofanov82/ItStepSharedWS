package lesson23.examples;

import java.io.FileNotFoundException;

public class MainExceptionsExample {
	
	public static void main(String[] sdfs) {
		int n = -2;
		if (n > 0) {
			int[] array = new int[n];
		} else {
			throw new OutOfMemoryError();
		}
		
		String s;

		
		double d = -2;
		System.out.println(d/0);
		System.out.println(Math.sqrt(d));
		System.out.println(Double.NaN);
		System.out.println(2/0);
	}
	
	
	
}
