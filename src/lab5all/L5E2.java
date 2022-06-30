package lab5all;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5E2 {
	
	public static void main(String[] args) {
		
		// range limits to search primes
		int num1 = -1;
		int num2 = -1;
		int min;
		int max;
		
		System.out.println("This program calculates the prime numbers in a range.\n");
		
		List<Integer> primes = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			while (num1 < 1) {
				num1 = scanner.nextInt();
				if (num1 < 1) {
					System.out.println("Number must be 1 or greater.");
				}
			}
			num2 = num1;
			while (num1 == num2 || num2 < 1) {
				System.out.println("Enter second number: ");
				num2 = scanner.nextInt();
				if (num2 < 1) {
					System.out.println("Number must be 1 or greater.");
				} else if (num1 == num2) {
					System.out.println("The second number cannot be the same as the first.");
				}
			}
			
			min = Math.min(num1, num2);
			max = Math.max(num1, num2);
			
			for (int i = min; i <= max; i++) {
				if (isPrime(i)) {
					primes.add(i);
				}
			}
			System.out.println("Prime numbers between " + min + " and " + max + ": " + primes);
		}			
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0 && num != i) {
				return false;
			}
		}
		return true;
	}

}
