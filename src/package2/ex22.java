package package2;

import java.util.ArrayList;
import java.util.List;

public class ex22 {
	
	public static void main(String[] args) {
		Book1 b1=new Book1();
		b1.read("Java Programmimg");
		Book1 b2=new EBook1();
		b2.read("http://ebook.com/ebook");
	}
}

class Book1{
	public String read(String bname) {
		return "Read "+bname;
	}
}

class EBook1 extends Book1{
	public String read(String url) {
		return "View "+url;
	}
}


