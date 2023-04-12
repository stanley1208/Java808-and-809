
package package1;


public class ex27 {
	
	
	public static void main(String[] args) {
		int num=5;
		int sum=0; // must initialize
	
		
		do {
			sum+=num;
		}while((num--)>1);
		System.out.println("The sum is "+ sum+".");
	}
	
	
}

