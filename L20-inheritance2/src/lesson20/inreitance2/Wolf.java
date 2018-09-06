package lesson20.inreitance2;

public final class Wolf extends Animal{
	
	final static String S_FIELD = null;
	final static String S_FIELD2 = "str";
	final static Object S_FIELD3 = new Cat();
	final static int S_FIELD4 = 4;
	
	final Object oField = new Cat();

	public Wolf() {
		
	}
	
	final public void makeSound() {
		System.out.println("Pppppppp");
	}
	
	final public void feed(String foodType, final int massa) {
		final int i;
		if (foodType.equals("заяц")) {
			System.out.println("Спасибо, любимый хозяин");
		} else {
			System.out.println("Сам это жри");
		}
	}
	
	public void aport(){
		System.out.println("Сам бегай за своей палкой");
	}

}
