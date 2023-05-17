package package5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ex4 {

	public static void main(String[] args) throws IOException {
	    BufferedReader brCopy = null;
	    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\GitHub\\JavaSolutions\\809\\src\\package5\\employee.txt"))) { // line n1
	        br.lines().forEach(c -> System.out.println(c));
	        brCopy = br;//line n2
	    }
	    brCopy.ready(); //line n3;
	}

}


