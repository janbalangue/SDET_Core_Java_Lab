package lab4all;

import java.util.function.IntPredicate;

public class L4E1 {

	public static void main(String[] args) {
		
		int[] nums = {5434, 3245, 4562};
//		int[] nums = {1,1,1};
		
		String sentence = "The largest number is ";
		
		if (nums[0] > nums[1] && nums[0] > nums[2]) {
			System.out.println(sentence + nums[0]);
		} else if (nums[1] > nums[0] && nums[1] > nums[2]) {
			System.out.println(sentence + nums[1]);
		} else if (nums[2] > nums[0] && nums[2] > nums[1]) {
			System.out.println(sentence + nums[2]);
		} else {
			System.out.println("All numbers are equal");
		}
	}

}
