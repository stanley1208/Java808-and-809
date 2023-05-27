package package10;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ex2 {

	public static void main(String[] args) {
		fly(()->new Bird());
		fly(Penguin::new);
		
		
	}
	
	static void fly (Supplier<Bird> bird) {
	    bird.get().fly();
	}
	
}

class Bird{
	
	public void fly() {
		System.out.println("Can fly");
	}
	
}

class Penguin extends Bird{
	public void fly() {
		System.out.println("Cannot fly");
	}
}