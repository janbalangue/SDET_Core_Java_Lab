package lab12all;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class L12E3 {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Requirements Engineering for Software and Systems", "Philip Laplante"));
		books.add(new Book("Applying UML and Patterns", "Craig Larman"));
		books.add(new Book("Clean Code", "Robert Martin"));
		books.add(new Book("Refactoring", "Martin Fowler"));
		books.add(new Book("The Mythical Man-Month", "Fred Brooks"));
		
		ListIterator<Book> bookIterator = books.listIterator();
		
		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next().toString());
		}
		
		System.out.println("-".repeat(50));
		
		while (bookIterator.hasPrevious()) {
			System.out.println(bookIterator.previous().toString());
		}
		
		
	}
}

class Book {
	
	public String title;
	public String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book " + title + " by " + author;
	}
}
