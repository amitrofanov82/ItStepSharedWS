package lesson44.threads2.unsafethreads;

public class ThreadChild extends Thread{

	@Override
	public void run() /*throws Exception*/ {
		// TODO Auto-generated method stub
		super.run();
		//throw new Exception("");
		throw new RuntimeException("");
	}
	
}
