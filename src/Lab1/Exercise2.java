package Lab1;

public class Exercise2 {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 45;
		int num3 = 17;
		
		int result = ++num1 + --num2 + num3++; // expected 68 since num3 is incremented after calculating result
		System.out.println(result);
	}
	
}
