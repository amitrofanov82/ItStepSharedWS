package tamagochi2;

public class TamagochiUI {
	private static final int EXIT = 0; /// это можно
	private static final int FEED = 1;
	private static final int SLEEP = 2;
	private static final int GAME = 3;
	private static final int VET = 4;
	private static final int SHOWER = 5;
	private static final int CLEAN = 6;
	private static final int PUMPER = 7;
	private static final int HOWAREYOU = 8;
	private static final int DOG = 1; /// А это зря. Повторяешься. У тебя уже
										/// есть Tamagochi.DOG.
	private static final int CAT = 2;
	private static final int ELEPHANT = 3;
	private static final int HORSE = 4;
	private static final int MOUSE = 5;

	Tamagochi tamagochi;
	String userName;

	TamagochiUI(String userName) {

	}

	void startGame() {
		System.out.print("Hello!\nChoose your animal:\n");
		System.out.print("1. Dog\t3. Elephant\n2. Cat\t4. Horse\n5. Mouse\n");
		System.out.print(">>>>> ");
		Tamagochi animal = new Tamagochi();
		boolean wrong; /// думаю лучше будет эту переменную внутрь do {}
						/// определить, раз уж за пределами цикла она не нужна
		do {
			wrong = false;
			switch (GetInt.get()) { /// для зрителей - это у Сани утилитный
									/// класс GetInt, в котором статический гет
									/// принимает цифру так, чтоб не иметь
									/// проблем со сканнером при совместном
									/// использовании nextInt() and nextLine()
			case DOG: {
				System.out.println("Enter the name");
				animal = new Tamagochi(GetString.get(), 60, 30, 40, DOG);
				break;
			}
			case CAT: {
				System.out.println("Enter the name");
				animal = new Tamagochi(GetString.get(), 30, 50, 70, CAT);
				break;
			}
			case ELEPHANT: {
				System.out.println("Enter the name");
				animal = new Tamagochi(GetString.get(), 100, 30, 50, ELEPHANT);
				break;
			}
			case HORSE: {
				System.out.println("Enter the name");
				animal = new Tamagochi(GetString.get(), 80, 20, 60, HORSE);
				break;
			}
			case MOUSE: {
				System.out.println("Enter the name");
				animal = new Tamagochi(GetString.get(), 20, 90, 30, MOUSE);
				break;
			}
			default: {
				wrong = true;
			}
			}
		} while (wrong);

		int amountOfFeed = 0; /// и здесь, лучше внутри вайла её определить
		while (animal.alive()) {
			System.out.println("Choose your action");
			System.out.print("1. Feed\t\t2. Sleep\t\t3. Game\t\t\t4. Vet\n5. Get shower\t");
			System.out.println("6. Clean up for a pet\t7. Pamper the pet\t8. Say: how are you?\n0. Leave your pet");
			// погладить, принять душ
			switch (GetInt.get()) {
			case EXIT: {
				System.out.println("Exiting...");
				System.exit(0);
				break;
			}
			case FEED: {
				int food, mass;
				do {
					System.out.println("What food?");
					System.out.print("1. Meat\n2. Fish\n3. Cheese\n4. Grass\n");
					food = GetInt.get();
					System.out.println("Mass?");
					mass = GetInt.get();
				} while (food < 1 && food > 4 && mass < 1 && mass > 100);
				amountOfFeed++;
				animal.feed(food, mass);
				break;
			}
			case SLEEP: {
				int hours;
				do {
					System.out.println("How long?");
					hours = GetInt.get();
				} while (hours < 1 && hours > 24);
				System.out.println("Sleep for " + hours + " hours");
				animal.sleep(hours);
				break;
			}
			case GAME: {
				animal.game();
				break;
			}
			case VET: {
				animal.vet();
				break;
			}
			case HOWAREYOU: {
				System.out.println(animal.HowAreYou());
				break;
			}
			case CLEAN: {
				animal.clean();
				amountOfFeed = 0;
				break;
			}
			case SHOWER: {
				animal.shower();
				break;
			}
			case PUMPER: {
				animal.pumper();
				break;
			}
			}
			animal.status();
			animal.endOfCycle();
			if (amountOfFeed >= 5) {
				animal.shit();
			}
		}

		System.out.println("You a bad master, your pet id dead! :-(");

	}

}
