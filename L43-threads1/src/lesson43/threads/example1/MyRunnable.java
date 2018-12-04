package lesson43.threads.example1;

public class MyRunnable implements Runnable {
	
	public void run() {
		while(true) {
			if (Math.random()<1/*0.00000005*/){
				System.out.println("4 alive");
			}
		}
	}
}
