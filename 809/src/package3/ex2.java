package package3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ex2 {

	public static void main(String[] args) {
		List<Book> books=Arrays.asList(new Book("Beginning with Java",2),new Book("A guide to Java Tour",3));
		Collections.sort(books,new Book());
		System.out.println(books);
	}

}

class Book implements Comparator<Book>{
	String name;
	double price;
	
	Book() {
		
	}
	
	Book(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public int compare(Book b1,Book b2) {
		return b1.name.compareTo(b2.name);
	}
	
	public String toString() {
		return name+":"+price;
	}
}