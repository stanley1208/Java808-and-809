package package6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ex3 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("C:/Users/user/Documents/version.txt");
				InputStreamReader isr=new InputStreamReader(fis);
				BufferedReader br=new BufferedReader(isr);){
			if(br.markSupported()) {
				
				System.out.println((char)br.read());
				br.mark(2);
				System.out.println((char)br.read());
				br.reset();
				System.out.println((char)br.read());
				
				
				System.out.println((char)br.read());
				System.out.println((char)br.read());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
