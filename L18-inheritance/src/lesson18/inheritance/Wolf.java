package lesson18.inheritance;

import lesson18.inheritance.package2.Animal;

public class Wolf extends Animal{

	public Wolf() {
		super("");
		System.out.println("Делаю волка");
	}
	
	public void makeSound() {
		System.out.println("Pppppppp");
	}
	
	public void feed(String foodType, int massa) {
		if (foodType.equals("заяц")) {
			System.out.println("Спасибо, любимый хозяин");
		} else {
			System.out.println("Сам это жри");
		}
	}

}
