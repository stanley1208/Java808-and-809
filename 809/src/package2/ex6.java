package package2;

public class ex6 {

	public static void main(String[] args) {
		AnotherSampleClass asc=new AnotherSampleClass();
		ex6 sc=new ex6();
		sc=asc;
		System.out.println("sc: "+sc.getClass());
		System.out.println("asc: "+asc.getClass());
	}

}
class AnotherSampleClass extends ex6{
	
}


