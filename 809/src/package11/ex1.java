package package11;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.function.ToIntFunction;

public class ex1 {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf; //line n1
		int x = indexVal.applyAsInt("Java"); //line n2
		System.out.println(x);
	}

}
