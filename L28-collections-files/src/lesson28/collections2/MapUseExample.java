package lesson28.collections2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUseExample {
	
	public static void main(String[] args) {
		Map<String, Set<String>> prepodToGroupMapping;
		
		prepodToGroupMapping = new HashMap<>();
		
		prepodToGroupMapping.put("Mitrofanov", new HashSet<>());
		prepodToGroupMapping.put("Mitrofanov2", new HashSet<>());
		
		System.out.println(prepodToGroupMapping);
		
		//Set<String> naborGrup1 = new HashSet<>(); 
		//prepodToGroupMapping.put("Mitrofanov2", naborGrup1);
		
		
		prepodToGroupMapping.get("Mitrofanov").add("The Best Group");
		System.out.println(prepodToGroupMapping);
		
	}

}
