package lesson14.objects.compostition;

public class Human {

	public static int количествоБездомныхКрокодилов = 0;
	public Animal pet;
	public String name;

	public Human(String name) {
		this.name = name;
	}

	public void vygoniPitomca() {
		количествоБездомныхКрокодилов++;
		System.out.println("питомец выгнан");
		
	}

}
