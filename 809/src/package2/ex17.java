package package2;

public class ex17 {
	
	
	public static void main(String[] args) {
		
		String names[]=new String[3];
		names[0]="Mary Brown";
		names[1]="Nancy Red";
		names[2]="Jessy Orange";
		try {
			for(String n:names) {
				try {
					String pwd=n.substring(0,3)+n.substring(6,10);
					System.out.println(pwd);
				}catch(Exception e) {
					System.out.println("String out of limits");
				}
				
			}
		}catch(Exception e) {
			System.out.println("Array out of limits");
		}
		
	}
}


