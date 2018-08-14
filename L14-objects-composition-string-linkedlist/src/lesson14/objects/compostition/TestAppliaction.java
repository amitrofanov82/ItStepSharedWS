package lesson14.objects.compostition;

public class TestAppliaction {
	public static void main(String[] args) {
		/*user1.sendPodmigivanie(user2);
		user2.waitReaction();
		if (user2.likes(user1)) {
			EmailService.send(user2, user1.phone);
		}*/
		
		
		
		Human chelVasya = new Human("Vasya");
		Auto car1 = new Auto(chelVasya);// params: Human, Animal, Wheel[]
		draw(car1);
		
		car1.driver.pet = new Animal("Gena", "Krokodil");
		
		Wheel[] wheels = new Wheel[4];
		for (int i=0; i<4; i++) {
			wheels[i] = new Wheel();
		}
		car1.wheels = wheels;
		
		draw(car1);
		
		car1.driver.vygoniPitomca();
		draw(car1);
		
		Auto car2 = new Auto("Простой человек");
		draw(car2);
		
		Auto car3 = new Auto();
		
	}

	private static void draw(Auto car1) {
		System.out.println("--------------");
		System.out.println("Я автомобиль");
		System.out.println("Моего водителя зовут " + car1.driver.name);
		System.out.println("У меня колес " + (car1.wheels == null ? "Я вообще без шасси" : car1.wheels.length));
		if (car1.driver.pet != null) {
			System.out.println("Питомец моего водителя: " + car1.driver.pet.type 
					+ " " + car1.driver.pet.name);
		} else {
			System.out.println("Мой водитель одинок");
		}
		

	}
	
	
	
}





















