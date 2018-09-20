package lesson23.examples;

public class ExceptionHandlingExample {
	public static void mainOld(String[] args) {
		/*for (int i = 0; i < 30; i++) {
			System.out.println(i + ": good");
			System.err.println(i + ": bad");
		}*/
		try{
			try {
				System.out.println("I'm trying...");
				ArrayUtils.printElementForIndex(new Object[23], -10);
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
			ArrayUtils.printElementForIndex(null, -10);
		} catch (Exception e) {
			//Do nothing
		}
	}

	public static void main(String[] args) {
		int tryCounter = 0;
		while(true){
			try {
				System.out.println(ArrayUtils.random());
				break;
			} catch (RandomException /*| PereuchetException*/ e) {
				System.out.println("Попытка номер " + tryCounter++);
				//do nothing, try again
			} catch (PereuchetException e) {
				System.out.println("Такого мы не ожидали...");
				//...
			} catch (Exception e) {
				System.out.println("нет смысла ждать, конец программы");
				System.exit(0);
			} catch (Error e) {
				System.out.println("Такого мы не ожидали...");
				//...
			}
		}
		
	}

}
