package package3;


import java.util.Arrays;
import java.util.List;

public class ex10 {
	
	
	public static void main(String[] args) {
			List<String> nums=Arrays.asList("EE","SE");
			String ans=nums
					.parallelStream()
					.reduce("Java ", (a,b)->a.concat(b));
			System.out.println(ans);
		}
	}


	






