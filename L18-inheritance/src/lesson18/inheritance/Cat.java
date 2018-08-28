package lesson18.inheritance;

import lesson18.inheritance.package2.Animal;

public class Cat extends Animal{

	public Cat() {
		System.out.println("Делаю кота");
	}
	
	public void makeSound() {
		System.out.println("Мяу");
	}
	
	public void feed(String foodType, int massa) {
		if (foodType.equals("рыба")) {
			System.out.println("Спасибо, любимый хозяин");
		} else {
			System.out.println("Сам это жри");
		}
	}
}
