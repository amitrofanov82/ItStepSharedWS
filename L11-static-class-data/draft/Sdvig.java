
public class Sdvig {
	public static void main(String[] args) {
		int[] massiv = {1,2,3,4,5,6};
		int k = 3;
		for (int i =0; i<k; i++){
			sdvig1(massiv);
			System.out.println("--------------");
			System.out.println("Сдвиг номер " + (i+2));
			System.out.println("--------------");
		}
			
	}
	
	private static void sdvig1 (int[] massiv){
		int temp = massiv[massiv.length -1];
		for (int i = massiv.length-2; i>=0; i-- ){
			massiv[i+1] = massiv[i];
		}
		otherExampleMethod(temp);
		massiv[0]=temp;
	}
	
	private static void print(int[] massiv){
		for(int n = 0; n < massiv.length; n++)
			System.out.print(massiv[n] + " | ");
	}
	
	private static void otherExampleMethod (int temp) {
		temp = temp + 10;
	}
	
}
