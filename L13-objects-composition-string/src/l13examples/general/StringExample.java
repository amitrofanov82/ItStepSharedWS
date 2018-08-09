package l13examples.general;

public class StringExample {
	
	public static void main(String[] args) {
		String s1 = "hgfh";
		
		char[] chararray = {'h','g','f','h'};
		String s2 = new String(chararray);
		
		char[] charsFromS1 = s1.toCharArray();
		charsFromS1[0] = 'A';
		System.out.println(charsFromS1);
		System.out.println(s1);
		
		s1 = s1 + "-продолжение";
		System.out.println(s1);
		
		String s10 = "-продолжение";//оптимизация джавы
		
		
	
		
		System.out.println(produceArithmeticProgression(0,1,10));
	}
	
	public static String produceArithmeticProgression(int a0, int k, int n) {
		String result = "";
		for (int i=0; i<n;i++){
			result += " " + (a0+k*i);
		}
		return result;
	}
	
	
	

}
