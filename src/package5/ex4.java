package package5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ex4 {

	public static void main(String[] args) throws IOException{
		BufferedReader brCopy=null;
		 try(BufferedReader br=new BufferedReader(new FileReader("C:/Users/88698/Desktop/employee.txt"))){
			 br.lines().forEach(c->System.out.println(c));
			 brCopy=br;
		 }
		 brCopy.ready(); // IOException

	}

}


