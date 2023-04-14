package package12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ex2 {

	public static void main(String[] args) {
		List<String>nL=Arrays.asList("Jim","John","Jeff");
		Function<String, String>funVal=s->"Hello : ".concat(s);
		nL.stream()
		.map(funVal)
		.forEach(System.out::println);

	}

}
