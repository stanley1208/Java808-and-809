package package2;

import java.util.ArrayList;
import java.util.List;

public class ex21 {
	
	public static void main(String[] args) {
		
	}
}

final class IceCream1{
	public void prepare() {}
}

class Cake1{
	public final void bake(int min,int temp){}
	public void mix() {}
}

class Shop1{
	private Cake1 c=new Cake1();
	private final double discount=0.25;
	public void makeReady() {c.bake(10, 120);}
}

class Bread1 extends Cake1{
//	public void bake(int minutes,int temperature) {}
	public void addToppings() {}
}



