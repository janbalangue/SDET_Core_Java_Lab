package lab7all;

public class L7E5 {
	
	public static void main(String[] args) {
		
		String string = "Pan Pun Prank Pit Pat";
		
		string = replaceP(string);
		
		System.out.println(string);
	}

	private static String replaceP(String string) {
		
		StringBuilder builder = new StringBuilder();
		
		for (char c: string.toCharArray()) {
			if (c == 'P') {
				builder.append('F');
			} else {
				builder.append(c);
			}
		}
		return builder.toString();
	}
}
