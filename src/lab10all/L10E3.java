package lab10all;

public class L10E3 {
	

	
	public static void main(String[] args) {
		
	}
}

class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public Parent(String name) throws Exception {
		System.out.println("Hello, " + name + "!");
		throw new Exception();
	}
}
class Child extends Parent {
	
	public Child() throws Exception {
		super("Ayaz");
		System.out.println("Child constructor");
	}
	
	public void throwSomething() {
		throw new RuntimeException();
	}
}
