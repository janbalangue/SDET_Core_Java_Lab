package lab11all;

import java.util.ArrayList;
import java.util.List;

public class L11E3 {

	public static void main(String[] args) {
		
		List<String> instruments = new ArrayList<>();
		
		instruments.add("piano");
		instruments.add("guitar");
		instruments.add("violin");
		instruments.add("cello");
		instruments.add("trumpet");
		
		if (instruments.contains("violin")) {
			System.out.println("List contains violin");
		}
		
		if (instruments.contains("saxophone")) {
			System.out.println("List contains saxophone");
		} else {
			System.out.println("List does not contain saxophone");
		}
	}
}
