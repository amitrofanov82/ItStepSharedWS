package lesson14.objects.privateConstructor;

public class UniversumUser {
	
	public static void main(String[] args) {
		//Application app = new Application();
		//app.start();
		
		Universum u = null;
		//u = Universum.createUniversum();
		u = Universum.getInstance();
		System.out.println(u.razmer);
	}
	
}
