package package2;

import java.util.ArrayList;
import java.util.List;

public class ex25 {
	
	public static void main(String[] args) {
		System.out.println(Book3.get());
		System.out.println(Book3.get());
	}
}

class Book3{
	private static Book3 b=new Book3();
	private Book3() {
		
	}
	public static Book3 get() {
		return b;
	}
}




