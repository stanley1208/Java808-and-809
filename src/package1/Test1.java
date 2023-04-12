package package1;

public class Test1 {

	public static void main(String[] args) {
		Book b1=Book.getBook();
		Book b2=Book.getBook();
		//b1.setName("Java");
		System.out.println(b1.getName());
		System.out.println(b2.getName());

	}

}
