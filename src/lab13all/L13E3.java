package lab13all;

import java.util.LinkedHashSet;
import java.util.Set;

public class L13E3 {
	
	public static void main(String[] args) {
		
		Set<String> characterSet = new LinkedHashSet<>();
		
		characterSet.add("elf");
		characterSet.add("mage");
		characterSet.add("drow");
		characterSet.add("bard");
		characterSet.add("paladin");
		characterSet.add("knight");
		
		if (characterSet.contains("rogue")) {
			System.out.println("characterSet has a rogue");
		} else {
			System.out.println("characterSet does not have a rogue");
		}
	}

}
