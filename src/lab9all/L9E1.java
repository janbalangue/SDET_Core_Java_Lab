package lab9all;

public class L9E1 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("The person who says something cannot be done should not interrupt the person doing it.");
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Executing finally block");
		}
	}

}
