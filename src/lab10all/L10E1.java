package lab10all;

public class L10E1 {
	
	public static void main(String[] args) {
		
		try {
			
			throw new MyCustomException();
		
		} catch (MyCustomException e) {
			
			System.out.println("Handling MyCustomException in main");
			System.out.println(e.toString());
		}
		
	}

}

class MyCustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyCustomException() {

	}
	
	public String toString() {
		return "MyCustomException occurred";
	}
}