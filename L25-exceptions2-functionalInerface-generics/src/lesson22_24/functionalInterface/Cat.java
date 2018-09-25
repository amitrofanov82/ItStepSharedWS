package lesson22_24.functionalInterface;

public class Cat {

	int dlinaHvosta;
	String name = Math.random() >0.5 ? "vasya" : "mashka";

	public Cat(){
		dlinaHvosta = (int) (Math.random()*1000);
	}
	
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

	@Override
	public String toString() {
		return "Кот " + name + " с хвостом " + dlinaHvosta;
	}
	
}
