package lab4all;

import java.util.Scanner;

public class L4E3 {
	
	public static double num;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		try {
			num = scanner.nextDouble();
			checkSign(num);
		} catch (Exception e) {
			System.out.println("Invalid input");
			return;
		}
		
	}
	
	public static void checkSign(double num) {
		
		if (num > 0) {
			System.out.println(num + " is positive");
		} else if (num < 0) {
			System.out.println(num + " is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

}
