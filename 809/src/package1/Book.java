package package1;

public class Book {

	
	private static String name;
	private static Book b=new Book(getName());
	
	private Book(String name) {
		this.name=name;
		
	}
	
	public static Book getBook() {
		return b;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Book.name=name;
	}
}
