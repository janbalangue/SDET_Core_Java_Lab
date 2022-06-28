package Lab1;

// calculate the area and perimeter of a rectangle
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println(perimeterRect(3, 4)); // expected 14
		System.out.println(areaRect(3, 4)); // expected 12
		
	}
	
	public static int perimeterRect(int length, int width) {
		int perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public static int areaRect(int length, int width) {
		int area = length * width;
		return area;
	}

}
