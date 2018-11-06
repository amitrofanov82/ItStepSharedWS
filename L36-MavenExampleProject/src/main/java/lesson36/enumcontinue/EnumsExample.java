package lesson36.enumcontinue;

import static lesson36.enumcontinue.Lang.*;

import java.util.Arrays;


/**
 *  some documented class
 */
public class EnumsExample {

	public static void main(String[] args) {
		System.out.println(Lang.ENGLISH.toString());
		System.out.println(Lang.ENGLISH.name());
		System.out.println(Lang.ENGLISH.compareTo(Lang.RUSSIAN));
		System.out.println(Lang.ENGLISH.ordinal());
		System.out.println(Lang.ENGLISH == Lang.RUSSIAN);
		
		
		Lang[] allLangEnums = Lang.values();
		System.out.println(Arrays.toString(allLangEnums));
		
		Lang someEnumFromValueOf = Lang.valueOf("RUSSIAN");
		System.out.println(someEnumFromValueOf.ordinal());
		
		someEnumFromValueOf = Lang.valueOf(Lang.class, "ENGLISH");
		System.out.println("!" + someEnumFromValueOf.ordinal());
		
		System.out.println(Lang.ENGLISH.getDeclaringClass());
		System.out.println(Lang.ENGLISH.getClass());
	}

}
