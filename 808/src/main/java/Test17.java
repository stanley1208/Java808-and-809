
public class Test17 {
	public static void main(String[] args) {
		 int x = 6;
		 while (isAvailable(x)) {
		 System.out.print(--x); 
		 
		 }
		 }
		
		 public static boolean isAvailable(int x) { return --x > 0 ? true : false; }
		
	}

