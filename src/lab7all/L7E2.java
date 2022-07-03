package lab7all;

public class L7E2 {
	
	public static void main(String[] args) {
		
		String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		findUppercase(characters);
		findLowercase(characters);
		
	}
	
	public static void findUppercase(String characters) {
		
		System.out.println("Uppercase:");
		
		for (int i = 0; i < characters.length(); i++) {
			char c = characters.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
	}
	
	public static void findLowercase(String characters) {
		
		System.out.println("Lowercase:");
		
		for (int i = 0; i < characters.length(); i++) {
			char c = characters.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
	}

}
