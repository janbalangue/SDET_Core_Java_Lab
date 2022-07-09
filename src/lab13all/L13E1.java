package lab13all;

import java.util.HashSet;
import java.util.Set;

public class L13E1 {
	
	public static void main(String[] args) {
		
		Set<String> characterSet = new HashSet<>();
		
		characterSet.add("elf");
		characterSet.add("mage");
		characterSet.add("drow");
		characterSet.add("bard");
		characterSet.add("paladin");
		characterSet.add("knight");
		
		characterSet.forEach(System.out::println);
	}

}
