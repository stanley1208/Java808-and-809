package package1;


	
public class ex22{
	
	int fvar;
	static int cvar;
	
	public static void main(String[] args) {
		ex22 t=new ex22();
		
		t.fvar=100;
		t.cvar=200;
		cvar=100;
		ex22.cvar=300;
		
}
}





