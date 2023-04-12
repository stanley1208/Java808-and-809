package package2;

public class ex4 {

	public static void main(String[] args) {
		
	}

}
final class IceCream{
	public void prepare() {
		
	}
}

class Cake{
	public final void bake(int min,int temp) {
		
	}
	
	public void min() {
		
	}
	
}

class Shop{
	private Cake c=new Cake();
	private final double discount=0.25;
	
	public void makeReady() {
		c.bake(10, 120);
	}
}

class Bread extends Cake{
//	public void bake(int minutes,int temperature) {
//		
//	} wrong
	
	public void addToppings() {
		
	}
}

