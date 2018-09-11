package examples21.interfaces;

public class Cat extends Animal implements CelestialBody {

	int height = 0;
	String name = Math.random() >0.5 ? "vasya" : "mashka";
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Cat() {
		
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
	
	public void catchMouse() {
		System.out.println("Ловлю мышей");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Кот + " + name + "прощается с вами навсегда");
		super.finalize();
	}

	@Override
	public String toString() {
		return "Кот " + name + " живущий по адресу " + hashCode();
	}

	@Override
	public void setHeight(int heightInMeters) {
		height = heightInMeters;
		
	}

	@Override
	public String fall() {
		return "шмяк";
	}
	
	
}
