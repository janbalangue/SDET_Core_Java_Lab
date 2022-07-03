package lab7all;

import java.util.Scanner;

public class L7E3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] list = new String[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter string number " + (i + 1));
			list[i] = scanner.nextLine();
		}
		System.out.println("Concatenated: " + list[0].concat(list[1]));
		scanner.close();
	}

}
