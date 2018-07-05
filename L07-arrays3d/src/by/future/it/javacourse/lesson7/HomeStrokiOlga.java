package by.future.it.javacourse.lesson7;

public class HomeStrokiOlga {
	public static void main(String[] args) {
		char stroka1[] = { 'm', 'i', 'r', 'u', ' ', 'm', 'i', 'r' };
		char[] stroka2 = { 'm', 'i', 'r','q' };

		// перебираем элементы строки 2
		//int s2=0;
		for (int s2=0; s2 < stroka2.length; s2++) {
			// перебираем элементы массива 1
			for (int s1 = 0; s1 < stroka1.length; s1++) {
				for (int d = 0; d < stroka2.length; d++) {

					// сравниваем строку с массивом
					if (stroka2[d] == stroka1[s1]) {
					}
					System.out.println("podstroka");
					if (stroka2[d] != stroka1[s1]) {
					}
					System.out.println("ne podstroka");
				}
			}
		}//end external for
		//System.out.println(s2);
		
	}
}
