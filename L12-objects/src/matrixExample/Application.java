package matrixExample;

public class Application {
	
	public static void main(String[] args) {
		Matrix A = new Matrix();
		Matrix B = new Matrix(4, "Вторая");
		
		//A.createRandomData(3, "Первая");
		//B.createRandomData(3, "Вторая");
		
		A.print();
		B.print();
		
		A.add(B);
		A.print();
	}
}
