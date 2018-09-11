package DragonNightGame;

public class PetLife {

	private static Pet ChosenOne = null;

	static int dayCount;

	private static void rulesNGoals() { // правила игры
		System.out.println("\nRules and Goals\n"
				+ " Вашей целью является победить Химеру в Лесах. Вы выбираете любого дракона\n"
				+ " (отличия минимальные), а затем растите его. Вы можете проверять использовать уникальную\n"
				+ " способность вашего дракона, кормить тремя типами еды на Ваш выбор, чтобы питомец не умер\n"
				+ " от голода, и отправлять на охоту ради получения золотых монет, которые,имея достаточно\n"
				+ " здоровья, можно поменять на чешую Золотого дракона. Всего необходимо иметь 30 единиц\n "
				+ "здоровья и 10 золотых монет на момент превращения.Но стоить иметь ввиду, что охота опасное\n"
				+ " занятие, урон неизбежен,и если упустить момент со здоровьем Ваш питомец может погибнуть.\n");
	}

	private static void getRandomStats(Pet pet) {
		Pet.speed = (int) (Math.random() * 11 + 2);
		Pet.power = (int) (Math.random() * 11 + 2);
		Pet.health = (int) (Math.random() * 21 + 3);
	}

	public static void printCurrentStats(Pet pet) {
		if (Pet.coins == 0) {
			System.out.println(
					"\n Your drake, named " + Pet.name + " , now have " + Pet.speed + " of speed, " + " its power now "
							+ Pet.power + " , its health is " + Pet.health + ", and you have no golden coins. ");
		} else {
			System.out.println("\n Your drake, named " + Pet.name + " , now have " + Pet.speed + " of speed, "
					+ " its power now " + Pet.power + " , its health is " + Pet.health + ", and you have " + Pet.coins
					+ " of golden coins. ");
		}
	}

	private static void hunger(Pet pet) { // создается дракон
		if (Pet.health >= 1) {
			switch (Pet.stomach) {
			case 1:
				System.out.println("\nYour pet died due hunger ");
				Pet.health = 0;
				break;
			case 2:
				System.out.println("\nYour pet is starving" + "\n( ◦.◦) ");
				break;
			case 3:
				System.out.println("\nYour pet is feeling a real hunger" + "\n( ಠ.ಠ) ");
				break;
			case 4:
				System.out.println("\nYour pet is feeling a little hunger" + "\n( ^-^) ");
				break;
			default:
				System.out.println("\nYour pet is feeling fine" + "\n(◕‿◕  ) ");
				break;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome, stranger!"); // выводится приветствие

		rulesNGoals(); // правила // все норм, можно включать в финальной версии

		ChosenOne = UserInteraction.createNewPet(); // создается питомец

		System.out.println(ChosenOne.getClass()); // проверка на выбранный класс

		ChosenOne.makeNoise(); // kinda intro

		Chimera Chyre = new Chimera(); // создается злодей

		///////// несмотря на то, что химеру создаю новою,
		///////// хп у нее остается старое, поэтому приходится его переназначать

		Chimera.health = 30;

		System.out.println(Chimera.name + ", The Chimera, was created.");
		/// кто создает Химер?
		// придумать эту ветку

		getRandomStats(ChosenOne); // питомец получает случайные характеристики

		printCurrentStats(ChosenOne); // вывод для игрока

		dayCount = 0;

		do {
			dayCount++; // один день - одно действие
			System.out.println("\n Day " + dayCount); // текущий день
			// System.out.println(ChosenOne.getClass()); //проверка на изменение класса
			hunger(ChosenOne); // механизм голода
			printCurrentStats(ChosenOne); // вывод текущих статов
			int choice = UserInteraction.userChoice(ChosenOne, Chyre); // действие
			// System.out.println(ChosenOne.getClass()); // проверка на изменение класса
			Pet.stomach--; // проголодался за день
			if (Chimera.health <= 0) { /// можно так ограничить игру
				break;
			}
			System.out.println(Chimera.health); // можно убрать
		} while (!(Pet.health <= 0));

		if (Pet.health <= 0) {
			System.out.println(" Game Over, man" + "\n ( x.x  )");
			
		} else if (Chimera.health <= 0) {
			System.out.println("Congrats, pal! you beat the game");
			System.out.println("╰(▔'∀'▔   )╯");
		}
	}
}
