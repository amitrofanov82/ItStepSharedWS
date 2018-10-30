package lesson34.comaprator_example;

import java.io.Serializable;
import java.util.Comparator;

public class BigStoneComparator implements Comparator<Stone>, Serializable {

	String field1 = "f1";
	
	public String sayHello(){
		System.out.println("Hello");
		return "night";
	}
	
	@Override
	public int compare(Stone o1, Stone o2) {
		if (field1.equals(sayHello())) {
			
		}
		return  o1.weight - o2.weight;
	}

}
