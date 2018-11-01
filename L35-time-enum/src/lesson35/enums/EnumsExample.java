package lesson35.enums;

import static lesson35.enums.DoW.*;
import static lesson35.enums.Lang.*;


/**
 *  some documented class
 */
public class EnumsExample {

    private final static double PI = 3.1459;

	public static void main(String[] args) {
		printAddDayOfWeek(TUE, Lang.RUSSIAN);
		printAddDayOfWeek(MON, Lang.ENGLISH);
		
		System.out.println(MON.getLocaliazedName(Lang.RUSSIAN));
		
		printPi();
	}
	
	/**
	 * @param day - week day int constant at EnumsExample class
	 * @param lang - language int constant at EnumsExample class
	 */
	public static void printAddDayOfWeek(DoW day, Lang lang){
		day.getLocaliazedName(lang);
		
		/*switch(day) {
		case MON: 
			if (lang == RUSSIAN){
				System.out.println("Панядзелак");
			} else if (lang == ENGLISH) {
				System.out.println("Monday");
			}
			break;
		case TUE: 
			if (lang == RUSSIAN){
				System.out.println("Вторник");
			} else if (lang == ENGLISH) {
				System.out.println("Тьюздэй");
			}
			break;
		default:
			if (lang == RUSSIAN){
				System.out.println("Не знаю такого дня");
			} else if (lang == ENGLISH) {
				System.out.println("I don't know such day");
			}
		}*/
	}
	
	private static void printPi() {
		System.out.println(PI);
		
	}
}
