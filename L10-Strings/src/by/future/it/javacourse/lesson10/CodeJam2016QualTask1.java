package by.future.it.javacourse.lesson10;

public class CodeJam2016QualTask1 {
	
	public static void main(String[] args) {
		String[] input = {"0", "1", "2", "11", "1692"}; 
		String[] output = new String[5];
		for (int i=0; i<input.length; i++ ) {
			output[i] = "Case " + i + ": "
					+ resolveSingleCase(Integer.parseInt(input[i]));
		}
		CommonUtils.printArr(output);
	}
	
	private static String resolveSingleCase(int N) {
		boolean chisla[] = new boolean[10];
		int i = 0;
		
		
EXTERNAL:
	    while (true) {
			if (i==2000000) {
				return "INSOMNIA";
			}
			i=i+1;
			int currentSheepNumber = i*N;
			//for every figure in i*N
			while (currentSheepNumber !=0){
				//mark figure as met
				int lastFigure = currentSheepNumber % 10;
				chisla[lastFigure] = true;
				currentSheepNumber /= 10;
			}	
			//check if not end
			for (int j=0; j<chisla.length; j++) {
				if (chisla[j] == false) {
					continue EXTERNAL;
				}
			}
			return Integer.toString(i*N);
		}
	}

}
