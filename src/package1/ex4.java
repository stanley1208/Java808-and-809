package package1;

public class ex4 {

	public static void main(String[] args) {
		m ma=m.getM();
		m mb=m.getM();
		System.out.println(ma);
		System.out.println(mb);

	}

}

class m{
	
	private m() {}
	
	private static m m1=new m();
	
	public static m getM() {
		return m1;
	}
}


