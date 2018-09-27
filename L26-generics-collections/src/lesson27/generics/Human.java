package lesson27.generics;

public class Human {
	private String name;
	private int age;

	public Human(int age) {
		this.age = age;
		name = "Аркадий";
	}

	public String toString() {
		return name + ", " + age + " лет";
	}

	public int compare(Object human) {
		return this.age - ((Human) human).age;
	}

}
