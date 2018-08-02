
public class OtherClass {
	
	private static final String AUTHOR_NAME = "Лёша";
	
	static {
		System.out.println("другой класс готов к жизни");
	}
	
	public static String giveMeAuthor(){
		return AUTHOR_NAME;
	}
	
}
