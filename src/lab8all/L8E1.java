package lab8all;

import java.util.Scanner;

public class L8E1 {

	public static void main(String[] args) {
		
		String[] strs = new String[2];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter string number " + (i + 1));
			strs[i] = scanner.nextLine().trim();
		}
		
		if (strs[0].equals(strs[1])) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		scanner.close();
	}
}
