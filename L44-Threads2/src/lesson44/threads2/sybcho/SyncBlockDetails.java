package lesson44.threads2.sybcho;

import java.io.File;

public class SyncBlockDetails {
	
	static Object lock2 = new Object();
	
	Object kassaLock = new Object();
	Object sejfLock = new Object();
	Object accountLock = new Object();
	
	public static void main(String[] args) {
		File t1Data = new File("f1");
		File t2Data = new File("f2");
		new T1(t1Data);
		new T2(t2Data);
		new T3(t2Data);
		
		
		
		Object o = null;

		
	}
	
	static /*synchronized*/ void sharedDataModification(File f1){
		synchronized (SyncBlockDetails.class){
			
		}
	}
	
	static /*synchronized*/ void  someOtherDangerMethod(File f1){
		synchronized (SyncBlockDetails.class){
			
		}
	}
	
	static void thirdDangerMethod(File f1){
		synchronized (f1){
			
		}
	}
	
	/*synchronized*/ void objectDangerMethod(){
		synchronized(this) {
			//many code
		}
	}
	
	void evrooptCashing(String operation){
		switch(operation) {
		case "getCashFromCassier":
			synchronized(kassaLock) {
				//many code
			}
		case "storeInSafeLock":
			synchronized(sejfLock) {
				//many code
			}
		case "transferToBank":
			synchronized(accountLock) {
				//many code
			}
		}
	}
	
	
	
	static class T1 extends Thread{
		File data;
		
		T1(File data) {
			this.data = data;
		}
		
		@Override
		public void run() {
			//many independent code
			sharedDataModification(data);
			//many independent code
		}
		
	} 
	
	static class T2 extends Thread{
		File data;
		
		T2(File data) {
			this.data = data;
		}
		
		@Override
		public void run() {
			sharedDataModification(data);
		}
		
	} 
	
	static class T3 extends Thread{
		File data;
		
		T3(File data) {
			this.data = data;
		}
		
		@Override
		public void run() {
			sharedDataModification(data);
		}
	} 
	
}
