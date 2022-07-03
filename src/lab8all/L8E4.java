package lab8all;

public class L8E4 {
	
	public static void main(String[] args) {
		String[] strings = {"Hello,", " World!"};
		
		System.out.print("Using StringBuilder: ");
		StringBuilder builder = new StringBuilder(strings[0]);
		builder.append(strings[1]);
		System.out.println(builder.toString());
		
		System.out.print("Using StringBuffer: ");
		StringBuffer buffer = new StringBuffer(strings[0]);
		buffer.append(strings[1]);
		System.out.println(buffer.toString());
		}

}
