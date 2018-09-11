package examples21.interfaces;

public class MainExample {
	
	public MainExample() {
		
	}
	
	public static void main(String[] args) {
		CelestialBody[] bodies = new CelestialBody[10];
		for (int i = 0; i< bodies.length; i++) {
			if (Math.random() < 0.33) {
				bodies[i] = new Cat();
			} else if (Math.random() < 0.5) {
				bodies[i] = new Wolf();
			} else {
				bodies[i] = new Stone();
			}
			bodies[i].setHeight((int) (Math.random()*1000));
		}
		
		for (int i = 0; i< bodies.length; i++) {
			System.out.println(bodies[i].fall());
		}
		
	}

}
