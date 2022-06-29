package lab3e2;

public class L3E2 {

	public static int calculatePerimeter(int side) {
		// square
		return side * 4;
	}
		
	public static int calculatePerimeter(int length, int width) {
		// rectangle
		return 2 * (length + width);
	}
	
	public static int calculatePerimeter(int side1, int side2, int side3) {
		// triangle
		return side1 + side2 + side3;
	}
	
	public static void main(String[] args) {

		System.out.println("Area of square with side 5: " + calculatePerimeter(5));
		System.out.println("Area of rectangle with length 7 and width 3: " + calculatePerimeter(7, 3));
		System.out.println("Area of triangle with sides 24, 13, 36: " + calculatePerimeter(24, 13, 36));
		
	}

}
