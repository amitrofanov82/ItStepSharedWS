package lesson44.threads2.unsafethreads;

import java.util.Map;

public class Main {
	static /*volatile*/ int counter = 0;
	static long start = System.currentTimeMillis();
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			int localCopy;
			synchronized(Main.class) {
				localCopy = counter;
			}

			for (int i = 0; i<70000000; i++) {
				localCopy++;
				//increaseCouner();
			}
			synchronized(Main.class) {
				counter+=localCopy;
			}
		});
		Thread t2 = new Thread(() -> {
			/*try {
				t1.join();
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}*/
			int localCopy;
			synchronized(Main.class) {
				localCopy = counter;
			}
			for (int i = 0; i<70000000; i++) {
				localCopy++;

				//increaseCouner();
				//Main.main(null);
			}
			synchronized(Main.class) {
				counter+=localCopy;
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter);
		System.out.println(System.currentTimeMillis() - start);
	}
	
	static synchronized void increaseCouner(){
		System.out.println(Thread.currentThread().getName());
		counter++;
	} 
	
	
	static void systemThreadsExperiment(){
		Map<Thread, StackTraceElement[]>  stMap;
		//look content in debug mode
		stMap = Thread.getAllStackTraces();
		System.out.println("bye");
	}
	
	
}
