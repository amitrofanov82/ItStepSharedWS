package l13examples.objects.sort;

public class Human {
	public int age = (int) (Math.random() * 121);
	public int weight = (int) (Math.random() * 300);
	
	public String name = Math.random() >0.5 ? "Lena" : "Masha";
	
	public void printMe(){
		System.out.println("I'm " + name + ", I'm " + age + " yrs old, " 
				+ ". I'm " + (weight > 200 ? "fat" : "thin"));
	}
}
