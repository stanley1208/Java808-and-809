
package package1;


	
public class ex24 extends Root{
	
	
	
	public static void main(String[] args) {
		Root r=new ex24();
//		 System.out.println(r.method1()); // line1
		System.out.println(r.method2()); // line2
		
}
}

class Root{
	
	private static final int MAX=20000;
	
	private int method1() {
		int a=100+MAX; // line 3
		return a;
	}
	
	protected int method2() {
		int a=200+MAX; // line 4
		return a;
	}
}