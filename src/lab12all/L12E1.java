package lab12all;

import java.util.ArrayList;
import java.util.List;

public class L12E1 {
	
	public static void main(String[] args) {
		
		List<String> instruments = new ArrayList<>();
		
		instruments.add("piano");
		instruments.add("guitar");
		instruments.add("violin");
		instruments.add("cello");
		instruments.add("trumpet");
		
		List<String> tempi = new ArrayList<>();
		
		tempi.add("largo");
		tempi.add("allegretto");
		tempi.add("presto");
		tempi.add("andante");
		tempi.add("adagio");
		
		instruments.addAll(tempi);
		
		System.out.println("Instruments list: " + instruments);
	}

}
