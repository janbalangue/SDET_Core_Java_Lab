package lab14all;

import java.util.Hashtable;

public class L14E3 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> groceryHashtable = new Hashtable<>();
		
		groceryHashtable.put(2, "milk");
		groceryHashtable.put(3, "onions");
		groceryHashtable.put(5, "apples");
		groceryHashtable.put(1, "ketchup");
		groceryHashtable.put(4, "oranges");
		
		System.out.println(groceryHashtable.entrySet());
		
		groceryHashtable.remove(1);
		
		System.out.println(groceryHashtable.entrySet());
	}
}
