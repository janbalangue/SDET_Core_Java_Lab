package lab13all;

import java.util.TreeSet;

public class L13E4 {
	
	public static void main(String[] args) {
		
		TreeSet<String> characterSet = new TreeSet<>();
		
		characterSet.add("elf");
		characterSet.add("mage");
		characterSet.add("drow");
		characterSet.add("bard");
		characterSet.add("paladin");
		characterSet.add("knight");
		
		System.out.println("First character is " + characterSet.first());
		System.out.println("Last character is " + characterSet.last());
	}

}
