package by.future.it.javacourse.lesson4;

public class HomeWorkLetters {
	
	public static void main (String [] args) {
		
		//letters1 A,B,C,D,E,F
		String l1  = "A,B,C,D,E";
		System.out.print(l1);
		
		int startLetter = 'A';
		System.out.println(startLetter++);
		System.out.println(startLetter++);
		System.out.println(startLetter++);
		System.out.println(startLetter++);
		
		int startLetterCode = 90;
		int startSmallLetterCode = startLetterCode+32;
		System.out.println((char) startLetterCode-- + 
				" , " + startSmallLetterCode++);
		System.out.println((char) startLetterCode-- + 
				" , " + startSmallLetterCode++);
		System.out.println((char) startLetterCode-- + 
				" , " + startSmallLetterCode++);
		
		
		//codes of letters z x y w
		for(char i='z'; i>='w'; i--) {
            int c=i;
            System.out.println(i+" :"+c+".");
        }
		
		//codes of letters Z X Y W
				for(char i='Z'; i>='W'; i--) {

		            System.out.println(i+" :"+(i+32)+".");
		        }
	}
		
	
}



