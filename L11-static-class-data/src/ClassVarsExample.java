
public class ClassVarsExample {
	
	private static int methodCallCounter = 0;
	
	public final static double PI;
	
	private final static double INTERNAL_CONSTANT = 3.14;
	
	static {
		System.out.println("я загруззился в память");
		int a =4;
		PI = 3.143;
	}
	
	public static void main(String[] args) {
		System.out.println("Пи равно " + Math.PI);
		System.out.println("автор класса 2 это " + OtherClass.giveMeAuthor());
		
		int dlina = 10;
		System.out.println(dlina * PI);
		
		m1();
		for (int i=0; i<(int) Math.random()*20; i++) {
			if (i%2 == 0) {
				m2(4);
			} else {
				m3(2.71);
			}
		}
		System.out.println(methodCallCounter);
	}
	
	private static int m1(){
		int veryUsefulNumber = 4;
		methodCallCounter++;
		return veryUsefulNumber;
	}
	
	/**
	 *  useless method
	 */
	private static int m2(int i){
		methodCallCounter++;
		return 0;
	}
	
	private static int m3(double i){
		methodCallCounter++;
		return 0;
	}
	
	public static int mX(double i){
		Math.sin(methodCallCounter);
		return 0;
	}
	

}
