package DragonNightGame;

public class Pet { // класс предок всего 

	public static String name;
	public static int speed;
	public static int power;
	public static int health;
	public static int stomach = 6; // значение произвольное 
	public static int coins = 60;
	public static  void makeSound(String message) { 
		System.out.println("- " + message + " - said your pet");
	}
	public  void makeNoise() {
	}
	public  void specialAbility() {
	}
}

// типы питомцев

class FireDrake extends Pet {
	// огненный дракон может майнить монеты без вреда для здоровья, надо ограничитель какой , типа химера беситься что лес полыхает
	FireDrake() {
		 name = "Deathwing";
	}
	public void makeNoise() {
		System.out.println("FIYAAA!!!");
		System.out.println("(>O<  )");
	}
	public void specialAbility() {
		FireDrake.coins += (int) (Math.random() * 20 + 10);
		System.out.println(FireDrake.name + " uses Wild Fire, that's burn part of woods. "
				+ "All wildlife dies and leaves golden coins. Now you have " + FireDrake.coins + " golden coins");

	}
}

class WaterDrake extends Pet {
	// антиголод
	WaterDrake() {
		Pet.name = "Hydra";
	}
	public void makeNoise() {
		System.out.println("Glup...");
		System.out.println("(~.~ )");
	}
	public void specialAbility() {
		WaterDrake.stomach += 5;
		System.out.println(Pet.name + " uses Rain Absorb. \nWith that " +
		WaterDrake.name + " can live without food about 5 days");
		System.out.println("«(  ~_~)«");
				}
	}


class MistDrake extends Pet {
	// может убить химеру не входя в лес, ввести ограничитель, типа химера бесится и гонит дичь из леса, рандом инкаунтер
	MistDrake() {
		 Pet.name = "Hidden";
	}
	public void makeNoise() {
		System.out.println("Swift like a wind ~");
		System.out.println("(-_- )");
	}
	public void specialAbility() {
		// check
		System.out.println("Chimera's health is " + Chimera.health);
		Chimera.health -= 10;
		System.out.println(MistDrake.name + " uses Blades of Fog." + "Your pet can hurt anything in woods without"
				+ " even going there.\n Somewhere screams one chimera");
		System.out.println("(  -_-) >>>");
		//check again
		System.out.println("Chimera's health is " + Chimera.health);
					}
	}



class EarthDrake extends Pet {
	// танк
	public EarthDrake() {
		Pet.name = "GroundDigger";
	}
	static int speed;
	static int power;
	static int health;
	static int stomach ; 
	public void makeNoise() {
		System.out.println("Its clobbering time!");
		System.out.println("( ¬▂¬)");
	}
	public void specialAbility() {
		EarthDrake.health += 20;
		System.out.println(EarthDrake.name + " uses Terra Armor.\nYour pet becomes bigger.");
		System.out.println("<^( ¬.¬)^>");
		}
	}


class GoldenDragon extends Pet {
	// высший зверь 
	static int speed;
	static int power;
	static int health;
	static int stomach = Pet.stomach ;
	static boolean specialIsOn = false;
	public void makeNoise() {
		System.out.println("You da best!\n=(─‿‿─   )=");
	}
	public void specialAbility() {
		if(specialIsOn == true){
			Pet.makeSound(" I already have three heads. That's more than enough");
			System.out.println("=('_'(   ¬‿‿¬) '.')=");
		}else if(specialIsOn == false){
			specialIsOn = true; 
			Pet.power *= 3;
			System.out.println(GoldenDragon.name + " uses Aurum Gate ." + "\nYour pet now have three "
				+ "additional heads. And thus, your pet becomes more powerful");
			System.out.println("=('_'(   ¬‿‿¬) '.')=");
				}
			}
}
// злодей

class Chimera extends Pet {
	static String name = "Chyre";
	static int speed = 10;
	static int power = 11;
	static int health;
	///спешлы ей прописать
}
