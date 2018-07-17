package by.future.it.javacourse.lesson9;

import java.io.IOException;

public class TwodArrayTodebug {

	public static void main(String[] args) throws IOException {
		
		int[] emptyArr = new int[0];
		int[] nullArr;
		System.out.println(args[2]);
		
		int b = 10;
		int[] a = {1,2,4};
		//System.out.println(a[10]);
		twoDarrayPrint(b);
		System.out.println(b);
		//System.in.read();
	}
	
	public static void twoDarrayPrint(int a) {
		a++;
		// int abc = 4;
		{
			@SuppressWarnings("unused")
			int abc = 3;
		}

		int[][] array = new int[4][4];

		int max = 16;
		int min = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				//System.out.println("i=, j=, min=, max=");
				if (min <= max) {
					//не забыть потом удалить
					/*if (i == 3 && j == 3) {
						System.out.println(
						    "! при 3 3 заполнялось"
						);
					}*/
					array[i][j] = min;
					min++;
				}
			}
		}
		for (int z = 0; z < array.length; z++) {
			for (int x = 0; x < array[z].length; x++) {
				/*if (array[z][x] == 0) {
					System.out.println(
					    "LOOK!!!??! При ошибке было z="+z+" x="+x
					);
				}*/
				System.out.print(array[z][x] + " | ");
			}
			System.out.println();
		}

	}

}
