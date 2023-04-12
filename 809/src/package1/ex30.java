package package1;

public class ex30 implements Interface1, Interface2{
	
	
	public static void main(String[] args) {
		Interface1 obj=new ex30();
		obj.sayHi();
		
	}
	
	public void sayHi() {
		System.out.println("Hi MyClass");
	}
	
	
	
	
}
interface Interface1{
	public default void sayHi() {
		System.out.println("Hi Interface-1");
	}

}
interface Interface2{
	public default void sayHi() {
		System.out.println("Hi Interface-2");
	}
}

