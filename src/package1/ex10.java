package package1;


	
public class ex10 {

	
	
	public static void main(String[] args) {
		String product="Pen";
		product.toLowerCase();
		product.concat(" BOX:".toLowerCase());
		System.out.print(product.substring(4,6));// StringIndexOutOfBoundsException
	}

	
	
}
