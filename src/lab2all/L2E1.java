package lab2all;

public class L2E1 {

	public static void main(String[] args) {
		int num = 23;
		boolean isCorrect = true;
		String name = "James Gosling";
		
		printInt(num);
		printIsCorrect(isCorrect);
		printName(name);
	}
	
	public static void printInt(int num) {
		System.out.println("Number is " + num);
	}
	
	public static void printIsCorrect(boolean isCorrect) {
		System.out.println("isCorrect = " + isCorrect);
	}
	
	public static void printName(String name) {
		System.out.println("Name is " + name);
	}

}
