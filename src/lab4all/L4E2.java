package lab4all;

public class L4E2 {
	
	public static void main(String[] args) {
		
		char letter = 'u';
		
		if (!Character.isLetter(letter)) {
			System.out.println(letter + " is not a letter");
			return;
		}
		
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(letter + " is a vowel");
			break;
		case 'y':
			System.out.println("y is sometimes a vowel");
			break;
		default:
			System.out.println("letter is a consonant");
		}
		
	}

}
