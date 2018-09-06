package lesson20.inreitance2;

public class exampleApp {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal[] zooPark = new Animal[10];
		Cat[] kotopark = new Cat[10];
		
		for (int i = 0; i< zooPark.length; i++) {
			kotopark[i] = new Cat();
			if (Math.random() > 0.15) {
				zooPark[i] = new Cat();
			} else {
				zooPark[i] = new Wolf();
			} 
		}
		
		int a = 20;
		double d = (double) a;
		a = (int) d;
		
		for (int i = 0; i< zooPark.length; i++) {
			Animal mayBeCatMayBeDog = zooPark[i];
			Animal someAnimal = kotopark[i];
			Cat tochnoKot = (Cat) someAnimal;
			if (zooPark[i] instanceof Cat ) {
				Cat tochnoKot2 = (Cat) zooPark[i];
				tochnoKot2.catchMouse();
			} else {
				((Wolf) zooPark[i]).aport();
			}
			
			mayBeCatMayBeDog.makeSound();
			System.out.println(mayBeCatMayBeDog.getClass());
			
		}
		
		System.out.println(kotopark[2].equals(kotopark[3]));
		
		for (int i = 0; i< zooPark.length; i++) {
			System.out.println(zooPark[i]);
		}
		
	}
	
}
