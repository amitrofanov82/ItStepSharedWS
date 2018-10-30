package lesson34.comaprator_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompMain {
	
	public static void main(String[] args) {
		List<Stone> stones = new ArrayList<Stone>(); 
		for (int i = 0; i< 10; i++) {
			stones.add(new Stone());
		}
		
		
		Comparator<Stone> comp = new Comparator<Stone>(){
			@Override
			public int compare(Stone o1, Stone o2) {
				return  o1.weight - o2.weight;
			}
		};
		
		//Collections.sort(stones, comp);
		/*Collections.sort(stones, (s1, s2) -> {
			return s1.weight - s2.weight;
		});*/
		Collections.sort(stones, new BigStoneComparator());
		
		
		for(Object o : stones) {
			System.out.println(o);
		}
	}
	
}
