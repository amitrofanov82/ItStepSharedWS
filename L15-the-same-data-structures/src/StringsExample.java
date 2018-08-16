
public class StringsExample {
	
	public static void main(String[] args) {
		//String s1 = "ghfhjhfhgfhjf\n sdgfsdgf\t\taskg\r\n";
		/*
		char c = '\"';
		char c2 = '"';
		String s2 = "aaaaaaaaaaaaaaa";
		System.out.println(s2 + c + s2);
		
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("a\tb	c\nasdfg");
		
		System.out.println("qwerty \r\n ajhf \nsdfui\n  ");
		System.out.print("\r1%");
		System.out.print("\r2%");
		System.out.println("asd\0fgh");

		System.out.println("\u0041");*/
		
	
		
		stringMethods();
	}
	
	
	public static void stringMethods(){
		String s = "aaaaaaaaaaqasd\0fghwerty \r\n ajhf \nsdfui\n aaaaa\uabcd\uabce";
		// \0 \r\n \n
		while(s.contains("\0")){
			s = s.replace('\0','\n');
			s = s.replace("\0","\n");
		}
		s.replaceAll("\r\n", "\n");//Uses RegExp язык
		String[] splitString = s.split("\n");
		for (int i = 0; i<splitString.length; i++) {
			System.out.println(splitString[i]);
		}
		
	}
}
