package lesson20.inreitance2;

import java.util.Scanner;

public abstract class Animal {
	
	protected int x=0, y=0, z=0;
	private int mood = 5; //1-10
	
	private String kind = "koshka";
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		System.out.println("имена не поддерживаются");
	}
	
	public Animal(Scanner sc) {
		
	}

	final public void move(int xStep, int yStep, int zStep){
		
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public abstract void makeSound(); /*{
		System.out.println("Не знаю чё говорить, может я рыба");
	}*/
	
	public abstract void feed(String foodType, int massa);

	/*public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}*/
}
