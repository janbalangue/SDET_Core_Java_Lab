package lab9all;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class L9E3 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter date:");
			formatDate(scanner.nextLine());
			
		} catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void formatDate(String string) {
		
		try {
			
			string = string.replaceAll("/", "-");
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(string, formatter1);
			
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			date = LocalDate.parse(date.toString(), formatter2);
			
			System.out.println("Date: " + date.toString().replaceAll("-","/"));
			
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
	}
}
