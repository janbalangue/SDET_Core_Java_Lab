package lab9all;

public class L9E2 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		
		try {
			
			System.out.println(nums[20]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
