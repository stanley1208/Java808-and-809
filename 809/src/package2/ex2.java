package package2;

public class ex2 {

	public static void main(String[] args) {
		EBook b1=new EBook();
		b1.read("Java Programmimg");
		EBook b2=new EBook();
		b2.read("http://ebook.com/ebook");
	}

}

class BookNew{
	private String read(String bname) {
		return "Read"+bname;
	}
}

class EBook extends BookNew{
	public String read(String url) {
		return "View"+url;
	}
}
