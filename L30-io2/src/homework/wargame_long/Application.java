public class Application {

	private double n = 1;

	public Application() {
		System.out.println("Please enter parameters");
		while (n != 0) {
			TimeRate f = new TimeRate();

			double vasyaTime = f.vasyaTime();
			double busTime = f.busTime(vasyaTime);

			if (vasyaTime < busTime) {
				System.out.println("Vasya, go better on foot");
			} else {
				System.out.println("\nTo take the bus is better for Vasya");
			}

			System.out.println("\nVasya's time - " + vasyaTime);
			System.out.println("Bus time - " + busTime);

			System.out.println("\nWould you like to repeat?");
			System.out.println("0 - no; 1 = yes");
			n = f.inputParameter();
		}
		if (n == 0){
			System.out.close();
		}
	}
	
}
