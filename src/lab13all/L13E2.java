package lab13all;

import java.util.HashSet;
import java.util.Set;

public class L13E2 {
	
	public static void main(String[] args) {
		
		Set<String> characterSet = new HashSet<>();
		
		characterSet.add("elf");
		characterSet.add("mage");
		characterSet.add("drow");
		characterSet.add("bard");
		characterSet.add("paladin");
		characterSet.add("knight");
		
		System.out.println("Size is " + characterSet.size());
	}

}
