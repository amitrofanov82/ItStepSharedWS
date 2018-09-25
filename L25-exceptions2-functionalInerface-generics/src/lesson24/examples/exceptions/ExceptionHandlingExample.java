package lesson24.examples.exceptions;

import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
	public static void mainOld(String[] args) {
		/*for (int i = 0; i < 30; i++) {
			System.out.println(i + ": good");
			System.err.println(i + ": bad");
		}*/
		try{
			try {
				System.out.println("I'm trying...");
				SomeUtilsWithExceptions.printElementForIndex(new Object[23], -10);
				System.out.println("End of critical section");
			} catch (ArithmeticException e) {
				System.out.println("Exception here...");
				//System.err.println("Всё плохо: " + e);
				System.out.println("Всё плохо: " + e);
				System.out.println("Всё плохо: " + e.getClass());
				throw new RuntimeException("Причина ошибки неисправима.", e);
				
			}
		} catch (Throwable t) {
			Throwable cause = t.getCause();
			if (cause != null) {
				System.out.println("Причиной всех наших бед является: " + cause);
			} else {
				System.out.println("Мне всегда не везёт");
			}
		}
		
		
		
		
		System.out.println("Danger is gone away");
		
		
		
		
		try {
			SomeUtilsWithExceptions.printElementForIndex(null, -10);
		} catch (Exception e) {
			//Do nothing
		}
	}

	public static void mainOld2(String[] args) throws FileNotFoundException {
		int tryCounter = 0;
		while(true){
			try {
				System.out.println(SomeUtilsWithExceptions.random());
				break;
			} catch (RandomException /*| PereuchetException*/ e) {
				System.out.println("Попытка номер " + tryCounter++);
				//do nothing, try again
			} catch (PereuchetException e) {
				System.out.println("Такого мы не ожидали...");
				//...
			} finally {
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("A");
			if (true){
				throw new NullPointerException("B");
			}
			System.out.println("C");
		} catch (IndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
			throw new RuntimeException("D");
		} catch (Exception e3) {
			System.out.println("E");
		} finally {
			System.out.println("F");
		}
		
		
	}
	
}
