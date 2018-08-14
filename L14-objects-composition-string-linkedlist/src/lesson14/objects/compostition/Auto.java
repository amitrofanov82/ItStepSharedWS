package lesson14.objects.compostition;

public class Auto {

	public static int количествоСозданныхАвтомобилей = 0;
	
	public Human driver;
	public Wheel[] wheels;

	{
		количествоСозданныхАвтомобилей++;
	}
	
	public Auto(Human chel) {
		this.driver = chel;
		//количествоСозданныхАвтомобилей++;
	}

	public Auto(String name) {
		this(new Human(name));
		//количествоСозданныхАвтомобилей++;
		Wheel[] wheels = new Wheel[4];
		for (int i=0; i<4; i++) {
			wheels[i] = new Wheel();
		}
		this.wheels = wheels;
		
		driver.pet = new Animal("Пудель", "каждому в подаркок по умолчанию");
		
	}
	
	public Auto() {
		
	}
	
}
