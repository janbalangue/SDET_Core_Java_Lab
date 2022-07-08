package lab10all;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L10E2 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter your name:");
			String name = scanner.nextLine();
			
			System.out.println("Enter your age:");
			int age = scanner.nextInt();
			
			System.out.println(name + " " + age);
			
			System.out.println("Throwing exception now...");
			throw new Exception();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Handling InputMismatchException");
			e.printStackTrace();
			
		} catch (Exception e) {
			
			System.out.println("Handling Exception");
			e.printStackTrace();
		}
	}

}
