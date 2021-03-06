package lesson24.examples.exceptions;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class SomeUtilsWithExceptions {
	
	public static void printElementForIndex(Object[] arr, int idx){
		if (Math.random() < 0.95) {
			Object o = new ArithmeticException(
					"Ошибка в рассчётах при обработке переданного массива.");
			throw (RuntimeException) o;
			//throw new ArithmeticException();
		}
		System.out.println(arr[idx]);
	}
	
	public static double random() throws RandomException, 
			PereuchetException, NullPointerException, FileNotFoundException {
		double d = Math.random();
		
		if (LocalDate.now().getYear() == 2018){
			throw new PereuchetException("Приемка товара, вернусь через 5 минут", "Маша коза блин");
		}
		//while (true){
		//try{
			if (d > 0.00001){
				throw new RandomException("Генератор случайных чисел находится "
						+ "на обслуживании, повторите попытку позже");
			} else  {
				return d;
			}
		//} catch (RandomException e ){
			
		//}
		//}
	}
	
}
