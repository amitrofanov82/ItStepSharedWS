package by.future.it.javacourse.lesson9;

public class MethodOverload {
	
	public static void main(String[] args) {
		int[] intArr = {1,2,4};
		double[] doubleArr = {1,2,4};
		char[] charArr = {65,66,67};
		String[] sArr = {"stroka1","hsgadf"," 5asgfxh"};
		
		by.future.it.javacourse.lesson9.CommonUtils.printArr(intArr);
		
		//System.out.println(intArr);
		System.out.println(charArr);
		CommonUtils.printArr(intArr);
		CommonUtils.printArr(charArr);
		CommonUtils.printArr(doubleArr);
		CommonUtils.printArr(sArr);
		
	}
	

	
}
