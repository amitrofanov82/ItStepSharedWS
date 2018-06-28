package by.future.it.javacourse.lesson4;

public class Operators {
	
	public static void main(String[] args) {
		
		//Arithmetic - see previous lesson
		
		//Comparison: >, >=, ==, <=, <, !=;
		boolean answer = (2>3);
		System.out.println(answer);
		
		//logic ||, &&, !
		boolean answer2 = (true || false);
		
		//prisvaivanie
		answer2 = !answer2;
		int a=2, b=3;
		a += 7; //a = a+7;
		a += b; //a = a+b;
		a *= b; //a = a*7;
		a -= (b+2); //a = a - (b+2);
		a /= 0;
		
		//all together:
		
		boolean hardQuestion; 
		//hardQuestion = !((a++ > b--) || ((b = b/(a*=10))<100) >0);
		
		//trenary operator:
		a = (answer == true) ? 10 : 20;
		
		//binary operators: 
		// >>, >>>, <<, |, &, ^, ~
		
		
		
		
		
		
		
		
		
		
	}
}



















