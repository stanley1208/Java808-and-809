package package2;

import java.util.ArrayList;
import java.util.List;

public class ex23 {
	
	public static void main(String[] args) {
		Bar d=new Daze();
		d.methodB("hello");
	}
}

class Foo{
	public void methodB(String s) {
		System.out.println("Foo "+s);
	}
}

class Bar extends Foo{
	public void methodB(String s) {
		System.out.println("Bar "+s);
	}
}

class Baz extends Bar{
	private Bar bb=new Bar();
	public void methodB(String s) {
		bb.methodB(s);
		super.methodB(s);
	}
}

class Daze extends Bar{
	private Bar bb=new Bar();
	public void methodB(String s) {
		bb.methodB(s);
		super.methodB(s);
	}
}



