package l13examples.general;

public class RekursivnyjFaktorial {
	public static void main(String[] args) {
		int n = 70;
		System.out.println(factorial(n));
	}

	/**
	 * etot method ne prednaznachen dla otricatelnyh chisel
	 */
	private static int factorial(int n) {
		if(n > 1){
			int result = n * factorial(n-1);
			System.out.println(result);
			return result;
		} else {
			return 1;
		}

	}
	
	
	
	
	
	
	
	
	
}
