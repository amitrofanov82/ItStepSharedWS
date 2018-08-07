package package1;
public class DragonBlankForItStep {
	private static int healthD;

	public final static int DRAGON_INIT_HEALTH = 1000;
	private static int atackD = 1;
	private static int healthK = 4000;
	private static int atackK = 50;
	private final static int B = 2;
	private final static int D = 3;

	public static void main(String[] args) {

		int turns = 0; // номер раунда
		healthD = DRAGON_INIT_HEALTH;

		while (true) {

			turns++;

			switch (choosedAction(turns, healthD, atackD, healthK, atackK, B, D)) {
			case 1: // выбрана атака
				System.out.println("Выбрана атака ");
				dragonAtack();
				break;
			case 2: // лечиться
				System.out.println("Выбрано лечение ");
				healthD = DRAGON_INIT_HEALTH;
				break;
			case 3:
				System.out.println("Выбрали увеличить силу удара дракона");
				buff();
				break;
			case 4:
				System.out.println("Выбрали уменьшить силу удара рыцаря");
				debuff();
				break;
			default: // необязателен
				// "так, по задумке автора, не должно быть");
				// break; бессмысленен он здесь

			}

			printCurrentstat(turns, healthD, atackD, healthK, atackK);
			// проверить не конец ли:
			if (healthK <= 0) {
				System.out.println("Рыцарь отступил и вернулся к маме");
				break;
			}

			knightAtack();

			if (turns > 1000) {
				System.out.print("Рыцарь живее всех живых");
				break;
			}
			System.out.println();

		}

	}

	private static void knightAtack() {
		healthD = healthD - atackK;
	}

	//0 - ничего
	//1 - dragon atack
	//2 - restoration
	//3 - buff
	//4 - debuff
	private static int choosedAction(int turns, int healthD, int atackD, int healthK, int atackK, int B, int D) {
		int action = 0;
		if (healthD < atackK && !((healthK - atackD) <0)) {
			action = 2;
		} else {

			if ((((healthK - atackD) / atackD) < ((healthK) / 
					(atackD + B))) || ((healthK - atackD) <= 0)) {
				action = 1;
			} else {
				action = 3;
			}
		}
		return action;
	}

	private static void buff() {
		atackD = atackD + B;
	}

	private static void dragonAtack() {
		healthK = healthK - atackD;
	}

	private static void debuff() {
		atackK = atackK - D;
	}

	private static void printCurrentstat(int turns, int healthD, int atackD, int healthK, int atackK) {
		System.out.println("Раунд №" + turns);
		System.out.println("Здоровье дракона: " + healthD);
		System.out.println("атака дракона: " + atackD);
		System.out.println("Здоровье рыцаря: " + healthK);
		System.out.println("атака рыцаря: " + atackK);
	}

}




































