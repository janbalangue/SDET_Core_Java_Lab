package lab8all;

public class L8E5 {
	
	public static void main(String[] args) {
		
		int num = 3049526;
		
		System.out.println("Number: " + num);
		System.out.print("Reversed: ");
		reverse(num);

	}

	private static void reverse(int num) {
		
		if (num < 10) {
			System.out.println(num);
			return;
		}
		
		System.out.print(num % 10);
		reverse(num / 10);
	}
	
}
