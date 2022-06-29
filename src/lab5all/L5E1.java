package lab5all;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// prints the first 10 values of a table
public class L5E1 {
	
	public static void main(String[] args) {
		
		try (BufferedReader bReader = new BufferedReader(new FileReader("csv/table.csv"))) {
			
			String name;
			int count = 0;
			
			while((name = bReader.readLine()) != null) {
				System.out.println(name);
				if (count == 9) break;
				count++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
