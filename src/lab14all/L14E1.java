package lab14all;

import java.util.HashMap;
import java.util.Map;

public class L14E1 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Imogen", "Heap");
		map.put("Tori", "Amos");
		map.put("Wendy", "Carlos");
		map.put("Chelsea", "Wolfe");
		map.put("Ryuichi", "Sakamoto");
		map.put("Kurt", "Ralske");
		map.put("Robert", "Smith");
		map.put("Scott", "Walker");
		
		if(map.containsKey("Wendy")) {
			System.out.println("Value of Wendy is " + map.get("Wendy"));
		}
	}

}
