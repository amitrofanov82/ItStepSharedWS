package by.future.it.javacourse.lesson6.homeworks;

public class SquareRoot {
	
	public static void main(String[] args) {
		long number = 5643543563L;
		
		/*разбить по односу числу
          действовать поэтапно, 
		  вероятно помогут остатки при делении на степени десятки
		
		  берём посл. цифру как остаток от деления на 10,
		  добавляем к сумме (изначально 0)*/
		
		
		//пока обновленное число не равно 0
		long sum = 0;
		while (number !=0) {
			//делим на 10, остаток добавляем к сумме
			//long remainder = number % 10;
			//sum = sum + number % 10;
			sum += number % 10;
			//чило обновляем результатом деления на 10
			number /= 10;
			//a += 5;
		}
		
		
		
		
		
		
		
	}
	
}
