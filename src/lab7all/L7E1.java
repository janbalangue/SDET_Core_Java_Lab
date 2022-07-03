package lab7all;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Bubble sort
public class L7E1 {

	public static void main(String[] args) {

//		System.out.println("Original array");
//		String str[] = { "Ciaz", "Alto", "Swift", "Dezire", "Brezza" };
//		printArray(str);
		
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program sorts entered strings alphabetically.");
		String string;
		do {
			System.out.println("Add string element to sort (type nothing and hit enter to end list):");
			string = scanner.nextLine();
			if (string.equals("")) {
				break;
			} else if (!string.trim().equals("")) {
					list.add(string);
			}
		} while (!string.trim().equals(""));
		scanner.close();
		if (list.isEmpty()) {
			System.out.println("No strings entered. Ending program.");
		} else {
			bubbleSort(list);
		}
	}

	// Uncomment print statements to show program flow
	private static void bubbleSort(List<String> list) {

		int n = list.size();
		boolean isSwapped = false;
		
		for (int i = 0; i < n - 1; i++) {
			
//			System.out.println("Start of pass " + i);
			
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					isSwapped = true;
				}
//				printArray(list);
			}
//			System.out.println("End of pass " + i);
			
			if (!isSwapped) {
//				System.out.println("No swaps this pass");
				break;
			}
		}
//		System.out.println("Final result");
		printArray(list);
	}

	public static void bubbleSort(String[] arr) {

		int n = arr.length;
		boolean isSwapped = false;
		
		for (int i = 0; i < n - 1; i++) {
			
//			System.out.println("Start of pass " + i);
			
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
//				printArray(arr);
			}
//			System.out.println("End of pass " + i);
			
			if (!isSwapped) {
//				System.out.println("No swaps this pass");
				break;
			}
		}
//		System.out.println("Final result");
		printArray(arr);
	}

	private static void printArray(String[] arr) {
		System.out.print("List: ");
		for (String str: arr) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	private static void printArray(List<String> list) {
		System.out.print("List: ");
		for (String str: list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
	}
	
}
