package lab14all;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class L14E5 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("call", "response");
		linkedHashMap.put("Abbott", "Costello");
		linkedHashMap.put("bread", "butter");
		linkedHashMap.put("biscuits", "gravy");
		linkedHashMap.put("Jekyll", "Hyde");
		linkedHashMap.put("Bonnie", "Clyde");
		
		Set<Entry<String, String>> set = linkedHashMap.entrySet();
		
		Iterator<Entry<String, String>> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
}
