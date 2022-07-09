package lab11all;

import java.util.ArrayList;
import java.util.List;

public class L11E1 {
	
	public static void main(String[] args) {
		
		List<String> instruments = new ArrayList<>();
		
		instruments.add("piano");
		instruments.add("guitar");
		instruments.add("violin");
		instruments.add("cello");
		instruments.add("trumpet");
		
		int index = 3; 
				
		System.out.println("Value at index " + index + " = " + instruments.get(index));
	}

}
