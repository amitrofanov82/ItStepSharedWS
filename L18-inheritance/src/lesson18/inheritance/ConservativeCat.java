package lesson18.inheritance;

public class ConservativeCat {

	PrimalInstinct primal = new PrimalInstinct("koshka");

	
	public void makeSound() {
		System.out.println("Мурр");
	}
	
	public void feed(String foodType, int massa) {
		if (foodType.equals("рыба")) {
			System.out.println("Спасибо, любимый хозяин");
		} else {
			System.out.println("Сам это жри");
		}
	}


}
