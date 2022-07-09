package lab12all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L12E2 {
	
	public static void main(String[] args) {
		
		List<Instrument> instruments = new ArrayList<>();
				
		instruments.add(new Instrument("piano"));
		instruments.add(new Instrument("guitar"));
		instruments.add(new Instrument("violin"));
		instruments.add(new Instrument("cello"));
		instruments.add(new Instrument("trumpet"));
		
		Collections.sort(instruments);
		
		instruments.forEach(a -> System.out.println(a.getName()));

		List<String> tempi = new ArrayList<>();
		
		tempi.add("largo");
		tempi.add("allegretto");
		tempi.add("presto");
		tempi.add("andante");
		tempi.add("adagio");
		
		if (tempi.get(0).compareTo(tempi.get(1)) > 0){
			System.out.println(tempi.get(0) + " > " + tempi.get(1));
		}
		
		Collections.sort(tempi, new Comparator<String>() {

			@Override
			public int compare(String t1, String t2) {
				return t1.compareTo(t2);
				
				// returns positive integer if t1 > t2
				// returns 0 if t1 == t2
				// returns negative integer if t1 < t2
			}
			
		});
		
		tempi.forEach(System.out::println);
	}

}

class Instrument implements Comparable<Instrument> {
	
	String name;
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Instrument instrument) {
		return this.name.compareTo(instrument.name);
	}
}


