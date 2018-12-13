package lesson45.thread3.sync_notifications;

import java.util.Map;

public class Main {
	
	static Object lock = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			
			synchronized(lock) {
				boolean waiting = false;
				while (true){
					if (waiting) {
						waiting = false;
						System.out.println("Проснулся");
					}
					System.out.println("111111111 inside sync block");
					if (Math.random() < 0.1) {
						try {
							waiting = true;
							System.out.println("T1 starts wait");
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
				}

			}
			
		});
		Thread t2 = new Thread(() -> {
			int counter =0;
			synchronized(lock) {
				while (counter++ < 5){
					try {
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
					}
					System.out.println("2222222222 inside sync");
				}
				lock.notify();
			}
		});
		Thread t3 = new Thread(() -> {
			int counter =0;
			synchronized(lock) {
				while (counter++ < 5){
					try {
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
					}
					System.out.println("3333 inside sync");
				}
				lock.notify();
			}
		});
		
		//lock.notify();
		//lock.wait();
		
		t1.start();
		t2.start();
		//Thread.sleep(3);
		t3.start();
		//Thread.sleep(3);
		
		while(t2.isAlive() || t3.isAlive()){
			synchronized(lock) {
				System.out.println("before notify");
				lock.notify();
				lock.wait();
				System.out.println("after notify");
			}
		}

		
		
		t1.join();
		t2.join();
		

		System.out.println("End of main");
	}//*.join
	

	

	
	
	
}
