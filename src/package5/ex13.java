package package5;


public class ex13 {
	
	static void dispResult(int[] num) throws Exception{
		try{
			System.out.println(num[1]/(num[1]-num[2]));
			
		}catch(ArithmeticException e) {
			System.err.println("First exception");
		}
		System.out.println("Done");
	}
	
	public static void main(String[] args){
		try {
			int[] arr= {100,100};
			dispResult(arr);
			
		}catch(IllegalArgumentException e) {
			System.err.println("Second Exception");
		}catch(Exception e) {
			System.err.println("Third Exception");
		}
	}

}




