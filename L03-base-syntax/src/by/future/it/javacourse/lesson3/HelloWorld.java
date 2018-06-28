package by.future.it.javacourse.lesson3;

public class HelloWorld {
	
	//commands and data
	
	//method syntax:
	//modificators, result_type, name (parametry) { ... }
	void anyMethod(){
		
	}
	
	public static void main(String[] args) {
		//any commands and data declaration
		
		
		
		//=========================
		// Data types (variables and literals)
		//=========================
		
		//type name = value;
		byte a = 30; //[-128, 127];
		byte a2 = 0b11110; //[-128, 127];
		//byte badA = 129;
		short b = 7000;
		//short badB = 33000;
		int c = 2000000000;
		int c2 = 0b11110111001101011001010000000000;
		int c3 = 0xF7359400;
		int c4 = 071;
		long d = 200000000000000000L;
		
		//rational
		float e = 2.46476457645647647654764535634634f;
		double f = -30.0;
		
		//symbol
		char g = 'F';
		char g2 = 'ß';
		
		//boolean
		boolean h = true;
		boolean h2 = false;
		
		
		System.out.println(g);
		System.out.println(g2);
		System.out.println((int) g);
		System.out.println((long) g2);
		System.out.println(e);
		System.out.println(c2);
		System.out.println(c3);
		
		String s = "Ja strokovyj literal";
		
		/*=========================
		**  Operators
		  =========================*/
		//1 Arithmetic: +-* / / % ++ --
		a = (byte) (a + 2); //result is int
		a = (byte) (a + a); // result is int
		b = (short) (b + 2);// result is int
		c = (int) (c+d);//result is long
		
		System.out.println((float)  (23/6)  );
		System.out.println(( (float)  23 )/6  );
		System.out.println(23.0/6);
		System.out.println(((float)a)/b);
		
		System.out.println(2300 % 2000L);
		
		//a++ <==> a = a+1; 
		//a-- <==> a = a-1; 
		
		//++a <==> a = a+1; 
		//++a <==> a = a-1; 
		
		c = (b = a);
		c = (b++);
		c = (++b);
		
		
	}
	
	
	
	
}



