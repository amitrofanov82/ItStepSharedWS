package DragonNightGame;

import java.util.Scanner;

public class UserInteraction {

	static Scanner s = new Scanner(System.in);

	static void useSpecialAbility(Pet drake, Chimera Chyre) {
		if (Pet.stomach <= 4) {
			Pet.makeSound("Im too hungry to use my special move...");
			System.out.println("(*´ー`) ");
			userChoice(drake, Chyre);
		} else {
			drake.specialAbility();
		}
	}

	static void feedDrake(Pet drake, Chimera Chyre) {
		Pet.makeSound("What we gonna eat? Chicken, Rice or Fries ?");
		System.out.println("1-Chicken (cost 15),2-Rice(cost 5),3-Fries(cost 10), 4 - Do other stuff");
		int choice2 = s.nextInt();
		switch (choice2) {
		case 1:
			if (Pet.coins >= 15) {
				System.out.println("You choose Chicken");
				Pet.health += 15;
				Pet.stomach += 3;
				Pet.makeSound(" That's good for my health. And for my stomach too." + "\nMunch munch...");
				System.out.println(" (  ^ ~ ^)");
				Pet.coins -= 15;
				Pet.makeSound("Thanks! I get a lot healthier.");
				System.out.println(" (  ︶ω︶ ) ");
				break;
			} else {
				Pet.makeSound("Need more gold! I can find more golden coins in woods.");
				userChoice(drake, Chyre);
				break;
			}
		case 2:
			if (Pet.coins >= 5) {
				System.out.println("You choose Rice");
				Pet.health += 5;
				Pet.stomach += 1;
				Pet.makeSound("I prefer chickens, but a rice fine too." + " \nMunch munch...");
				System.out.println(" ( ^ ~ ^)");
				Pet.coins -= 5;
				Pet.makeSound("Thanks! That's give me strength for a while.");
				System.out.println(" (  ︶ω︶ ) ");
				break;
			} else {
				Pet.makeSound("Need more gold to buy some food!" + " I can find more golden coins in woods.");
				userChoice(drake, Chyre);
				break;
			}
		case 3:
			if (Pet.coins >= 10) {
				System.out.println("You choose Fries");
				Pet.power += 5;
				Pet.health -= 5;
				Pet.makeSound(" Tastes good, but that's not healthy food." + " \nMunch munch...");
				System.out.println(" ( ^ ~ ^)");
				Pet.stomach += 2;
				Pet.coins -= 10;
				Pet.makeSound("Thanks! Suddenly, I can feel myself more powerful, " + "but less healthier.");
				System.out.println(" (  ︶ω︶ ) ");
				break;
			} else {
				Pet.makeSound("Need more gold! I can find more golden coins in woods.");
				userChoice(drake, Chyre);
				break;
			}
		case 4:
			UserInteraction.userChoice(drake, Chyre);
			break;
		default:
			System.out.println("Press 1 , 2 or 3 to get Chicken, Rice or Fries, " + "or press 4 to get back ");
			feedDrake(drake, Chyre);
		}
	}

	static void goKillSomething(Pet drake, Chimera Chyre) {

		System.out.println(
				"Are we going for coins or we'll try to beat the Chimera?" + "\n 1- for coins, 2 - for Chimera");

		int choice = s.nextInt();

		if (choice == 1) {
			Pet.health -= (int) Math.random() * 20 + 1; // рандомный урон от боя
														// в лесу
			if (Pet.health <= 0) {
				System.out.println("Guess what?");
			} else {
				int reward = (int) Math.random() * 11 + 20; // рандомное
				Pet.coins += reward;
				Pet.makeSound("Done, master! I've fought some beasts and earned " + reward + " coins");
				System.out.println("(`ヘ´  )");
			}

		} else if (choice == 2) {
			if (Chimera.health >= 0) {
				chimeraFight(drake, Chyre);
			} else {
				System.out.println(" There is no Chimera in these woods");
				System.out.println("╮(˘ ､ ˘  )╭ ");
			}
		} else {
			System.out.println("Please press 1 or 2, there is no other options. ");
			goKillSomething(drake, Chyre);
		}
	}

	////////////////////////// не меняется класс
	static void evolve(Pet drake, Chimera Chyre) {
		if (drake instanceof GoldenDragon) { 
			Pet.makeSound("I'm already Golden Dragon!"); 
		} else {
			Pet.makeSound(" Wanna me to grow bigger?"); 
			if ((Pet.health >= 10) && (Pet.coins >= 10)) {
				drake = new GoldenDragon();
				System.out.println(drake.getClass());
				System.out.println("Your drake has evolved");
				drake.makeNoise();
			} else if (Pet.health < 30) {
				Pet.makeSound("I need more food to grow up, feed me!");
				userChoice(drake, Chyre);
			} else  {
				System.out.println("You need more gold! You can get some in woods.");
				userChoice(drake, Chyre);
			
				
			}
		}
	}

	/////////////////////////
	static int userChoice(Pet drake, Chimera Chyre) {
		System.out.println(" -------------------------------- ");
		System.out.println(" Press 1 to feed your pet");
		System.out.println(" Press 2 go in woods for hunting");
		System.out.println(" Press 3 to use a special ability "); // test
		System.out.println(" Press 4 to get your pet evolved");
		System.out.println(" Press 5 to restart the game");
		System.out.println(" -------------------------------- ");

		int choice = s.nextInt();

		switch (choice) {
		case 1:
			UserInteraction.feedDrake(drake, Chyre);
			return 1;
		case 2:
			UserInteraction.goKillSomething(drake, Chyre);
			return 2;
		case 3:
			UserInteraction.useSpecialAbility(drake, Chyre);
			return 3;
		case 4:
			UserInteraction.evolve(drake, Chyre);
			return 4;
		case 5:
			PetLife.main(null);
			return 5;
		default:
			Pet.makeSound("What's wrong with you? \n    ლ(ಠ_ಠ ლ)");
			System.out.println(" You need to press from 1 to 5 ");
			return userChoice(drake, Chyre);
		}
	}

	static Pet createNewPet() {
		Pet result;
		
		System.out.println(
				" Choose your creature!\n" + " Press 1 to choose FireDrake,\n" + " press 2 to choose WaterDrake,\n"
						+ " press 3 to choose MistDrake,\n" + " press 4 to choose EarthDrake\n");

		int choice = s.nextInt();

		switch (choice) {
		case 1:
			result = new FireDrake();
			System.out.println("You choose a FireDrake!");
			break;
		case 2:
			result = new WaterDrake();
			System.out.println("You choose a WaterDrake");
			break;
		case 3:
			result = new MistDrake();
			System.out.println("You choose a MistDrake!");
			break;
		case 4:
			result = new EarthDrake();
			System.out.println("You choose a EarthDrake!");
			break;
		default:
			System.out.println("Think again, stranger. You need to press from 1 to 4");
			return createNewPet();
		}
		return result;

	}

	private static void chimeraFight(Pet drake, Chimera Chyre) {
		if (Pet.speed >= Chimera.speed) {
			System.out.println(Pet.name + " attacks first and deal " + Pet.power + " damage");
			Chimera.health -= Pet.power;
			if (Chimera.health > 0) {
				System.out.println(Chimera.name + " strikes back and deal  " + Chimera.power + " damage");
				Pet.health -= Chimera.power;
			}
		} else {
			System.out.println(Chimera.name + " attacks first and deal " + Chimera.power + " damage");
			Pet.health -= Chimera.power;
			if (Pet.health > 0) {
				System.out.println(Pet.name + " strikes back and deal  " + Pet.power + " damage");
				Chimera.health -= Pet.power;
			}
		}

		if (Chimera.health <= 0) {
			System.out.println("You kill the monster");
			drake.makeNoise();
		} else if (Pet.health <= 0) {
			System.out.println("Chimera killed your pet");
		} else {
			System.out.println("Your wounded pet run away");
			System.out.println("( ҂ Ò﹏Ó)");
			System.out.println("\nNow, Chimera have " + Chimera.speed + " of speed, has power  " + Chimera.power
					+ " , its health is " + Chimera.health);
		}
	}

}
