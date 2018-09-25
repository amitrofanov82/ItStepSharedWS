package lesson22_24.functionalInterface;

public class Human {
	public String sex;
	public String name;
	
	
	public Human(){
		name = "Женя" + Math.random()*1000;
		if (Math.random() >0.5) {
			sex = "M";
		} else {
			sex = "ZH";
		}
	}
	
	@Override
	public String toString() {
		return (sex.equals("M") ? "мальчик ":"девочка ") + name;
	}

}
