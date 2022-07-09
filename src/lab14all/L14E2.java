package lab14all;

import java.util.Hashtable;

public class L14E2 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> groceryHashtable = new Hashtable<>();
		
		groceryHashtable.put(2, "milk");
		groceryHashtable.put(3, "onions");
		groceryHashtable.put(5, "apples");
		groceryHashtable.put(1, "ketchup");
		groceryHashtable.put(4, "oranges");
		
		for (int key: groceryHashtable.keySet()) {
			System.out.println("Key = " + key);
		}
	}

}
