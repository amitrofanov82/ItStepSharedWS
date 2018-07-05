package by.future.it.javacourse.lesson7.examples;

public class Arrays2 {
	
	public static void main2(String[] args) {
		char[] bukvy = "ABCDEFGHJIKL".toCharArray();
		char[] podstrokaBezL = null;
		int start = 3, finish = 7;
		char[] podstrokaStartDoFinish = null;
		
		//...
		podstrokaBezL = bukvy;
		bukvy[0] = 'B';
		bukvy[1] = podstrokaBezL[2]; 
		//bukvy = podstrokaStartDoFinish;
		System.out.println(podstrokaBezL);
		//podstrokaBezL = bukvy;
		//System.out.println(podstrokaBezL);
		
		//....
		podstrokaBezL = new char[bukvy.length-1];
		System.out.println((char)(podstrokaBezL[0]+65));
		for (int i = 0; i<bukvy.length-1; i++ ) {
			podstrokaBezL[i] = bukvy[i];
		}
		System.out.println(podstrokaBezL);
		
		podstrokaStartDoFinish = new char[finish - start +1];
		for (int i = start; i<=finish; i++ ) {
			podstrokaStartDoFinish[i-start] = bukvy[i];
		}
		System.out.println(podstrokaStartDoFinish);
		
		//...
		podstrokaStartDoFinish = null;
		System.out.println(podstrokaStartDoFinish[0]);
	}
	
	public static void main(String[] args) {
		int[][] a = {{23,4,7},{1,2},{4,5,6}};
		int b[][] = new int[3][3];
		int[] c[][] = new int[2][][]; //непрактичный вариант
		
		int[][][][] d = null;
		
		
		//задача: в переменную massiv динамически положить 
		//"треугольный" массив с диагональю = 4
		//и заполнить числами от 1 до 10
		int[][] massivMassivov = new int[4][];
		for(int i =0; i<4;i++) {
			int[] tempNewArray = new int[i+1];
			massivMassivov[i] = tempNewArray;
		}
		
		for(int i =0; i<massivMassivov.length;i++) {
			for(int j = 0; j< massivMassivov[i].length ; j++) {
				System.out.print(massivMassivov[i][j] + " | ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
}
