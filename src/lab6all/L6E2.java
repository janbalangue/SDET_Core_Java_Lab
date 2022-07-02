package lab6all;

// Print a 2d array
public class L6E2 {
	
	public static void main(String[] args) {
		int[][] array2d = {
				{ 1 },
				{ 0, 3, 2 },
				{ 4, 7 },
				{ 9, 5, 7, 3 },
				{ 0 }
		};
		
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}
	}

}
