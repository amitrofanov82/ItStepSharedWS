package by.future.it.javacourse.lesson4;

public class FlowOperators {
	
	public static void main(String[] args) {
		//ax+b=c;
		/*double a = 1.2;
		double b = 7.2;
		double c = 3.2;
		System.out.println("Anser: " + (b-c)/a);*/
		
		
		//ax^2+bx+c = 0;
		//Math.sqrt(chislo);
		double a = 1;
		double b = 3;
		double c = 40;
		
		double d = (b*b - 4*a*c);// > 0 ? b*b - 4*a*c : -10000000;
		
		
		double x1 = (-b + Math.sqrt(d))/(2*a);
		double x2 = (-b - Math.sqrt(d))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
		
		
		
		//if, case, while, for (+foreach), do while
		
		//1 if 
		/* if (booleanExp) {
		   	  commands if booleanExp is true
		   } else if (booleanExp2) {
		   	  commands if booleanExp2 is true
		   } else if (...) { 
		   		...
		   } else {
		   	  commands if nothing is true
		   }
		 */
		
		if (d > 0) {
		   	//reshaem uravnenie
		}
		
		if (d > 0) {
		   	//reshaem uravnenie
		} else if (d == 0) {
			//reshaem po drugomu
		}
		
		if (d > 0) {
		   	//reshaem uravnenie
		} else if (d == 0) {
			//reshaem po drugomu
		} else {
			//resheniy net
		}
		
		//===============================
		boolean anyLogicalExpression = true;
		int startLetter = 'A';
		while (anyLogicalExpression){
			System.out.println(startLetter++);
			anyLogicalExpression = (startLetter != ('Z'+1));
		}
		
		while (startLetter <= ('Z'+1)){
			System.out.println(startLetter);
			startLetter += 2;
		}
		
		while (true){
			System.out.println(startLetter);
			startLetter += 2;
			if (startLetter > 'ф') {
				break;
			}
		}
		
		//================
		do {
			System.out.println(startLetter);
			startLetter += 2;
		} while (startLetter > 'ф');
		
		/*
		for (initCommand; 
				logicalExp; 
				postStepComand) {
		} 
		*/
		for (int i = 100; 
				i <= 200; 
				i++) {
			System.out.println(i);
		} 
		
		//==========
		int A = 10;
		if (A == 1) {
			System.out.println("адын");
		} else if (A == 2) {
			System.out.println("two");
		}else if (A == 3) {
			System.out.println("treo");
		}else if (A == 4) {
			System.out.println("quarta");
		}else if (A == 5) {
			System.out.println("furh");
		}else if (A == 6) {
			System.out.println("siedem");
		}else if (A == 7) {
			System.out.println("two");
		}
		
		
		switch (A){
		case 1:
			System.out.println("two");
			break;
		case 2:
			System.out.println("two");
			break;
		case 'A':
			System.out.println("two");
			break;
		case 4:
			System.out.println("two");
			break;
		default:
			System.out.println("two");
			break;
		} 
		
		
		
	}
	
}
