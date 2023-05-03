
package package1;


	
public class ex25 {
	
	void main() {
		System.out.println("one");
	}
	
	static void main(String args) {
		System.out.println("two");
	}
	
	public static void main(String[] args) {
		System.out.println("three");
		new ex25().main();
		main("aaa");
		Object[] x = new Object[3];
		new ex25().mina(x);
		
}
	
	void mina(Object[] args) {
		System.out.println("four");
	}
}

