package Lab1;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println(quotient(144, 12)); // 12
		System.out.println(remainder(55, 7)); // expected 6
		System.out.println(quotient(21, 0)); // expected error message and -1
	}
	
	public static int quotient(int num1, int num2) {
		if (checkValidDivision(num2)) {
			return (int) num1 / num2;
		}
		return -1;
		
	}
	
	public static int remainder(int num1, int num2) {
		if (checkValidDivision(num2)) {
			return num1 % num2;
		}
		return -1;
	}
	
	public static boolean checkValidDivision(int num) {
		if (num == 0) {
			System.out.println("Error - division by zero");
			return false;
		}
		return true;
	}
 }
