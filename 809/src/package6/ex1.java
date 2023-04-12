package package6;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ex1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter GDP: ");
		int GDP=Integer.parseInt(br.readLine());
		
		System.out.println(GDP);
	}

}
