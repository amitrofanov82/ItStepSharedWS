package by.future.it.javacourse.lesson6.homeworks;

public class PerformanceTest {

	public static void main(String[] args) {
		long number = 0;
		while (true){
			number = number + 1;
			if (number % 1000000 == 0) {
				System.out.println(number);
			}
		}


	}

}
