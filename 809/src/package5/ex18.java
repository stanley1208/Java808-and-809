package package5;

public class ex18 {
	
	public static void doStuff(String s) {
		try {
			if(s==null) {
				throw new NullPointerException();
			}
		}finally{
				System.out.println("-finally-");
			}
		System.out.println("-doStuff-");
	}
	
	
	public static void main(String[] args)throws Exception{
		try {
			doStuff(null);
		}catch(NullPointerException npe) {
			System.out.println("-catch-");
		}
	}
}

