package lesson28.collections2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SystemMapsMain {

	public static void main(String[] args) {
		Map<String,String> m = System.getenv();
		System.out.println(m.getClass());
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		Set<String> keySet = m.keySet();
		//бесполезно m.values();
		//полезно m.get(key);

		
		/*Iterator<Entry<String, String>> entrSetIterator = entrySet.iterator();
		while (entrSetIterator.hasNext()) {
			Entry<String, String> singleEntry = entrSetIterator.next();
			System.out.println(singleEntry.getKey()
						+ " : " + singleEntry.getValue()
					);
		}*/
		
		for (Entry<String, String> singleEntry : entrySet) {
			System.out.println(singleEntry.getKey()
						+ " : " + singleEntry.getValue()
					);
			//singleEntry.setValue("123");
		}
		
		
		//Sposob 2:
		for (String key : keySet) {
			System.out.println(key
					+ " : " + m.get(key)
				);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
