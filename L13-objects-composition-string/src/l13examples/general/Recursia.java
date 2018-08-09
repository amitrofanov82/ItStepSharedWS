package l13examples.general;

public class Recursia {
	
	public static void main(String[] args) {
		/*int i =1;
		System.out.println("вызов номер " + i);
		i++;
		main (null);*/

		System.out.println("main pered vyzovom methoda");
		method(1);
		System.out.println("main posle vyzova methoda");

		
		
		/*method(12);
		method(14);
		method2();*/
	}
	
	public static void method(int i){
		System.out.println("начало вызова номер" + i);
		if(i < 5){
			method(i+1);
		}
		System.out.println("конец вызова номер" + i);
	}
	
	/*public static void method2(){
		method(16);
	}*/
	
}




















