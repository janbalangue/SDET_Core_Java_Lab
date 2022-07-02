package lab6all;

public class L6E1 {

	public static void main(String[] args) {
		
		int[] nums = {12, 29, 2, 74, 6, 7, 10};
		int sum = 0;
		int average;
		
		for (int num: nums) {
			sum += num;
		}
		
		average = sum / nums.length;
		
		System.out.println("Average is " + average);
	}
}
