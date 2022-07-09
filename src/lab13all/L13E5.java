package lab13all;

import java.util.Iterator;
import java.util.TreeSet;

public class L13E5 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numSet = new TreeSet<>();
		
		numSet.add(11);	
		numSet.add(17);
		numSet.add(7);
		numSet.add(3);
		numSet.add(2);
		numSet.add(13);
		numSet.add(5);

		int[] nums = new int[numSet.size()];
		
		Iterator<Integer> iterator = numSet.iterator();
		
		int count = 0;
		
		while (iterator.hasNext()) {
			nums[count] = iterator.next();
			count++;
		}
		
		for (int i: nums) {
			System.out.print(i + " ");
			
			// TreeSet is sorted so these are in ascending order,
			// not the order in which the elements were added
		}
	}

}
