package by.future.it.javacourse.lesson10;

public class Strings {
	public static void main(String[] args) {
		
		String strokaForExample;
		strokaForExample = 
				3 + 3 + "2" + "2" + (2 + 2) + (!true);
		System.out.println("stroka=" + strokaForExample);
		
		char[] arrInString = strokaForExample.toCharArray();
		arrInString[0] = '&';
		strokaForExample = new String(arrInString);
		
	}
	
	//����������� �������� ����� ����
	static int strToInt(String chisloVStroke) {
		
		return 0;
	}
	
	//����������� �������� ����� ����
	static double strToDouble(String chisloVStroke) {
		
		return 0.0;
	}
	
	//���������� ���� �� ��� ���� �������������� ����
	static String strToDouble(double value){
		//String result = (String) value;
		return "" + value;
	}
	
	
}
