package by.future.it.javacourse.lesson5.homeworks;

public class PrimeNumbersAndFigureSum {

	public static void main(String[] args) {
		// int number
		int inputNumber = 179;

		for (int currentNumber = 2; 
				currentNumber <= inputNumber; 
				currentNumber++) {
			boolean isPrime = true;
			for (int nextNumber = 2; 
					nextNumber < currentNumber; 
					nextNumber++) {
				if (((currentNumber % nextNumber) == 0)) {
					// System.out.println("vse neprosto");
					isPrime = false;
				}
			}
			if (isPrime == true)
				System.out.println(" Your number " + currentNumber + " is simple ");
			//else
				//System.out.println(" Your number " + currentNumber + " is NOT simple ");

		}
	}
}
