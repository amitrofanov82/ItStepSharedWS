package by.future.it.javacourse.lesson5;

public class SquareRoot {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		double number = 3000000;
		double aproxStep = 0.00000001;
		double aproxValInterval = 0.01;
		
		for (double i = 0; i<= number; i+=aproxStep){
			if ((i*i < number + aproxValInterval)
				&& (i*i > number - aproxValInterval)){
				System.out.println("VOT ONO: " + i);
			}
		}
		
	}
}



















