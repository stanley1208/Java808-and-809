package package3;


import java.util.Arrays;
import java.util.List;

public class ex9 {
	
	
	public static void main(String[] args) {
			List<Product>products=Arrays.asList(
					new Product("MotherBoard",5),
					new Product("Speaker",20)
					);
			products.stream()
			.filter(Product.ProductFilter::isAvailable)
			.forEach(System.out::println);
		}
	}

class Product{
	String name;
	int qty;
	public String toString() {
		return name;
	}
	public Product(String name,int qty) {
		this.name=name;
		this.qty=qty;
	}
	static class ProductFilter{
		public static boolean isAvailable(Product p) {
			return p.qty>=10;
		}
	}
}
	






