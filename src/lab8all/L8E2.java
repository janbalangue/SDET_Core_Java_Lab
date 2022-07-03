package lab8all;

public class L8E2 {
	
	public static void main(String[] args) {
		
		String string = "49.1";
		
		
		@SuppressWarnings("removal")
		Double double1 = new Double(23.56);
		
		System.out.println(string + " + " +  double1 + " = " + (Double.parseDouble(string) + double1));
	}

}
