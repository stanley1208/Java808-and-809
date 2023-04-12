package package5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ex5 {

	static void doStuff() throws ArithmeticException, NumberFormatException, Exception{
		if(Math.random()>-1) throw new Exception("Try Agaiin");
	}
	
	public static void main(String[] args) {
		try {
			doStuff();
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}


