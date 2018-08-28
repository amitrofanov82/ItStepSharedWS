package lesson18.inheritance;

import java.util.Scanner;

import lesson18.inheritance.package2.Animal;

public /*abstract*/ class Fish extends Animal {

	public Fish(String name){
		super(name);
		int a;
	}
	
	public Fish(){
		
	}

	
	
	public Fish(String name, String otherparam){
		super(new Scanner(System.in));
		int a;
	}
	
	//@Override
	public void feed(String foodType, int massa) {
		//super.feed(foodType, massa);
		System.out.println("червяка бы");
		this.move(1,1,1);
		//super.feed("червяк", 4);
	}
	
	public void dive(){
		y--;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
	
}
