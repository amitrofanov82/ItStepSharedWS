package by.future.it.javacourse.lesson5.homeworks;

public class Draft {
	
	public static void main(String[] args) {
		long number = 5643543563L;
		
		/*������� �� ������ �����
          ����������� ��������, 
		  �������� ������� ������� ��� ������� �� ������� �������
		
		  ���� ����. ����� ��� ������� �� ������� �� 10,
		  ��������� � ����� (���������� 0)*/
		
		
		//���� ����������� ����� �� ����� 0
		long sum = 0;
		while (number !=0) {
			//����� �� 10, ������� ��������� � �����
			//long remainder = number % 10;
			//sum = sum + number % 10;
			sum += number % 10;
			//���� ��������� ����������� ������� �� 10
			number /= 10;
			//a += 5;
		}
		
		
		
		
		
		
		
	}
	
}
