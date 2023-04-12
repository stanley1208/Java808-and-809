package package2;

public class ex14 {
	int sum=0;
	
	public void doCheck(int number) {
		if(number%2==0) {
			//break;
		}else {
			for(int i=0;i<number;i++) {
				sum+=i;
			}
		}
	}
	
	public static void main(String[] args) {
		ex14 obj=new ex14();
		System.out.println("Red "+obj.sum);
		obj.doCheck(2);
		System.out.println("Orange "+obj.sum);
		obj.doCheck(3);
		System.out.println("Green "+obj.sum);
		
	}
}




