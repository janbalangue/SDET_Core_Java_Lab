package Lab2;

public class L2E3 {

	private String firstName;
	private String lastName;
	private int age;
	
	public L2E3() {
		this.firstName = "Jan";
		this.lastName = "Balangue";
		this.age = 21;
	}
	
	public L2E3(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void intro() {
		System.out.println("Hello, my name is " + firstName + " " + lastName + " and I am " + age + " years old.");
	}
	
	public static void main(String[] args) {
		
		L2E3 person1 = new L2E3("Bruce", "Lee", 33);
		L2E3 person2 = new L2E3();
		
		person1.intro();
		person2.intro();
		
	}

}
