package package1;

public class ex31 {
	
	
	public static void main(String[] args) {
		Product p1=new Product("PowerCharger");
		Product p2=p1;
		System.out.println(p1.equals(p2));
		Product p3=new Product("PowerCharger");
		System.out.println(p1.equals(p3));
		
	}
}
class Product{
	String pname;
	public Product(String pname) {
		this.pname=pname;
	}
}

