package lab14all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L14E4 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("call", "response");
		map.put("Abbott", "Costello");
		map.put("bread", "butter");
		map.put("biscuits", "gravy");
		map.put("Jekyll", "Hyde");
		map.put("Bonnie", "Clyde");
		
		List<String> valuesList = new ArrayList<>(map.values());
		
		System.out.println(valuesList);
	}

}
