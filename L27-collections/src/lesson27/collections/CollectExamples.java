package lesson27.collections;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CollectExamples {

	public static void main(String[] args) {
		List<? extends File> list = new LinkedList<File>();
		List<? super File> list2 = new LinkedList<File>();
		Queue<Object> queue = new LinkedList<>();
		LinkedList<Object> linkedList = new LinkedList<>();
		
		String[] sarr = {"zasd", "123sadxzc", "ASSDAS", "xxxxxx"};
		Arrays.sort(sarr);
		System.out.println(Arrays.toString(sarr));
		
		
		Collection c;
		Map m;
		
	}
	
	
}
