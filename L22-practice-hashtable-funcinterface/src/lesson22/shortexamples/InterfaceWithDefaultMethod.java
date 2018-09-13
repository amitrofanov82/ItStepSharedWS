package lesson22.shortexamples;

public interface InterfaceWithDefaultMethod {
	
	void m1();
	
	void m1(int i);
	
	String m1(String s1, String s2);
	
	default void someDefaultMethod() {
		System.out.println("Default method is working");
	}
	

}

























