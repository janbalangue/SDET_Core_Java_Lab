package lab12all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L12E4 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(23);
		nums.add(5);
		nums.add(-2);
		nums.add(16);
		nums.add(11);
		
		System.out.println("Minimum is " + Collections.min(nums));
		System.out.println("Maximum is " + Collections.max(nums));
	}
}
