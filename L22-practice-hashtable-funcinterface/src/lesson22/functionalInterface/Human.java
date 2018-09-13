package lesson22.functionalInterface;

public class Human  implements Sravnivaemyj  {
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
	
	@Override
	public int compare(Object o) {
		Human h = (Human) o;
		if (this.sex == "ZH" && h.sex == "M"){
			return 1;
		}
		if (this.sex == "M" && h.sex == "ZH"){
			return -1;
		}
		
		return this.name.length() - h.name.length();
	}
}
