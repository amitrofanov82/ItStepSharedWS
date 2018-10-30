package lesson34.nontransientrecusrsivefield;

import java.io.Serializable;

public class Serializable2  implements Serializable{
	
	public Serializable2(Serializable1 serializable1) {
		ser1 = serializable1;
	}
	int a =5;
	int b = 7;
	String c = "vasya";
	transient Serializable1 ser1;
}
