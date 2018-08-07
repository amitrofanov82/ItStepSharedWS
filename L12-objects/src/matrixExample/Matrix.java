package matrixExample;

public class Matrix {
	
	private int[][] matrixData;
	private String matrixName;
	
	
	//Метод-конструктор:
	public  Matrix(){
		this.matrixName = "По умолчанию";
		matrixData = new int[3][3];
		for (int i=0; i< matrixData.length;i++) {
			for (int j=0; j< matrixData.length;j++) {
				matrixData[i][j] = (int) (Math.random()*100);
			}
		}
	}
	
	public  Matrix(int d, String name){
		this.matrixName = name;
		matrixData = new int[d][d];
		for (int i=0; i< matrixData.length;i++) {
			for (int j=0; j< matrixData.length;j++) {
				matrixData[i][j] = (int) (Math.random()*100);
			}
		}
	}
	
	

	public void print() {
		Matrix.print(this);
	}

	public void add(Matrix b) {
		for (int i=0; i< matrixData.length;i++) {
			for (int j=0; j< matrixData.length;j++) {
				matrixData[i][j] = matrixData[i][j] + b.matrixData[i][j];
			}
		}
		
	}

	public void createRandomData(int dimension, String matrixName) {
		this.matrixName = matrixName;
		matrixData = new int[dimension][dimension];
		for (int i=0; i< matrixData.length;i++) {
			for (int j=0; j< matrixData.length;j++) {
				matrixData[i][j] = (int) (Math.random()*100);
			}
		}
	}
	
	public static void print(Matrix m) {
		System.out.println("--------------------------");
		System.out.println("MATRIX " + m.matrixName + ":");
		for (int i=0; i< m.matrixData.length;i++) {
			for (int j=0; j< m.matrixData.length;j++) {
				System.out.print("|"+m.matrixData[i][j]+ "| ");
			}
			System.out.println();
		}
	}

}
