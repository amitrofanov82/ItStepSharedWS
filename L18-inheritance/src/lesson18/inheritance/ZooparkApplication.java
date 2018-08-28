package lesson18.inheritance;

import lesson18.inheritance.package2.Animal;

public class ZooparkApplication {
	
	public static void mainOld(String[] args) {
		Animal[] zooPeople = new Animal[10];
		
		for (int i = 0; i< zooPeople.length; i++) {
			if (i%2 == 0) {
				zooPeople[i] = new Cat();
			} else {
				zooPeople[i] = new Wolf();
			} 
			if (i%4 == 0) {
				zooPeople[i] = new Fish("");
			}
		}
		
		for (int i = 0; i< zooPeople.length; i++) {
			zooPeople[i].move(1, 1, 0);;
		}
		
		for (int i = 0; i< zooPeople.length; i++) {
			zooPeople[i].makeSound();
		}
		
		//Cat cat = new Cat();
		//conservativecat.primal.move(2, 3, 1);

	}
	
	
	public static void main(String[] args) {
		nakormiSkotinu(new Cat());
		nakormiSkotinu(new Fish("Zolotaya"));
		//nakormiSkotinu(new Animal()); animal is abstract
		nakormiSkotinu(new Wolf());
	}
	
	
	public static void nakormiSkotinu(Animal animal) {
		animal.feed("заяц", 0);
	} 
	
	
	
	
	
	
}
