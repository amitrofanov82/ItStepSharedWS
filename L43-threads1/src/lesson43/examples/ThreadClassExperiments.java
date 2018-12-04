package lesson43.examples;

public class ThreadClassExperiments {
	
	public static void main(String[] args) {
		ex1();
	}

	private static void ex1() {
		Thread t = new Thread(() -> {
			while(true){
				System.out.println("222 I'm new Thread ");
			}
		});
		
		//t.run();
		t.setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		t.start();
		
		
		while(true){
			System.out.println("111 I'm new Thread ");
		}
		
	}
	
	private static void ex2() {
		Thread ct = Thread.currentThread();
		Thread.UncaughtExceptionHandler	 h 
			= Thread.getDefaultUncaughtExceptionHandler();
		ct.setDefaultUncaughtExceptionHandler(
				(t, e)-> System.out.println("всё хорошо"));
		System.out.println(h);
		h.uncaughtException(
				Thread.currentThread(), new RuntimeException());
	}
	
	
	
}
