package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex24 {

	public static void main(String[] args) {
		List<ProductA> li=Arrays.asList(new ProductA("TV",1000), 
										new ProductA("Refrigerator",2000));
				Consumer<ProductA> raise=e->e.setPrice(e.getPrice()+100);
				li.forEach(raise);
				li.stream().forEach(ProductA::printVal);
	}
}

class ProductA{
	String name;
	Integer price;
	ProductA(String name,Integer price)
	{
		this.name=name;
		this.price=price;	
	}
	
	public void printVal(){ System.out.print(name+" Price:"+price+" ");}
	public void setPrice(int price){this.price=price;}

	public Integer getPrice() {
		return price;
	}
	
}



