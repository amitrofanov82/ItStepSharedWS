package by.future.it.javacourse.lesson8;

public class OtherMethods {
	
	public static void main(String[] args) {
		int[] a1 = {4,12,34,43,67};
		int[] a2 = {-4,-2,0,49,2670};
		int[] a3 = {4,12,34,43,67};
		int[] a4 = {-4,-2,0,49,5670};
		
		
		//printIntArray(a1);
		//printIntArray(a2);
		//printIntArray(a3);
		//OtherMethods.printIntArray(a4);
		
		int absValue = Math.abs(-20);
		
		
		double[] testData = new double[2000];
		double[] testAnswersMathSqrt = new double[2000];
		double[] testAnswersOurSqrt = new double[2000];
		for (int i=0; i<testData.length; i++){
			testData[i] = 1000000 + (Math.random()*999000000);
		}
		
		long startTime = System.nanoTime();
		System.out.println("start: " + startTime);
		for (int i=0; i<testData.length; i++){
			testAnswersMathSqrt[i] = Math.sqrt(testData[i]);
			if (i % 500 == 0 && i!=0) {
				System.out.println("500 passed");
			}
		}
		long mileStone1 = System.nanoTime();
		System.out.println("Math time duration: " + (mileStone1 - startTime));
		for (int i=0; i<testData.length; i++){
			testAnswersOurSqrt[i] = OtherMethods.sqrtBinarySearch(testData[i]);
			if (i % 50 == 0 && i!=0) {
				//System.out.println("500 passed");
			}
		}
		long mileStone2 = System.nanoTime();
		System.out.println("Our sqrt time duration: " + (mileStone2 - mileStone1));
		for (int i=0; i<testData.length; i++){
			if (Math.abs(testAnswersOurSqrt[i] - testAnswersMathSqrt[i]) > 0.000000001) {
				System.out.println("ERROR!!!");
			}
		}
		System.out.println("Compare time duration: " + (System.nanoTime() - mileStone2));
		
	}
	
	
	//[accessModifier] [static] returnType anyName([type varName,...]) {
	// public,private,protected,""=package(friendly)
	//}
	private static void printIntArray(int[] arrayToPrint) {
		for (int i=0; i<arrayToPrint.length; i++){
			System.out.print(arrayToPrint[i] + " | ");
		}
		System.out.println();
	}
	
	public static double sqrtBinarySearch(double square) {
		double l = 0;
		double r = square;
		while (r > l) {
			double m = (r+ l)/2;
			if (m*m > square){ r = m;
			}
			else {
				l = m;
			}
			if (Math.abs(m*m-square)<0.000001){
				return m;
			}
		}
		return -1;
	}
	
	
	
	
}
