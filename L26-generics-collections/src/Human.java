
public class Human implements Comparable<Human> {
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

	@Override
	public int compareTo(Human o) {
		return compare(o);
	}

}
