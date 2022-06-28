package lab2all;

public class L2E2 {
	
	public static void main(String[] args) {
		float num1 = 1.2f;
		float num2 = 23.45f;
		float temp;
		
		System.out.println("Before swap (num1 and num2): " + num1 + " " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swap (num1 and num2): " + num1 + " " + num2);

	}

}
