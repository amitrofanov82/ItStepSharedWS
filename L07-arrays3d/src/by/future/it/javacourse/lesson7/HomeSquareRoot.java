package by.future.it.javacourse.lesson7;

//https://habr.com/post/219595/
public class HomeSquareRoot {

	public static void main2(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		double square = 1687834;
		double l = 0;
		double r = square;
		while (r > l) {
			System.out.println("r="+r);
			System.out.println("l="+l);
			double m = (r+ l)/2;
			//System.out.println(l);
			if (m*m > square){ r = m;
			}
			else {
				l = m;
			}
			if ((m*m == square)||(m*m == l)||(m*m == r)){
				System.out.println("FOUND!!!!");
				break;
			}
			
		}
		System.out.println("Scuare root " + square + " = " + l);

		
		System.out.println(System.currentTimeMillis() - startTime);
	}

	
	public static void main(String[] args) {
		double f = 0.0;
		for (int i=1; i <= 10; i++) {
			f += 0.1;
		}
		System.out.println(f);
	}
}
