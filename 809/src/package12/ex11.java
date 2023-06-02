package package12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex11 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
		    int i = 0;
		    boolean result = s.contains("pen");
		    System.out.print(i++ + " : ");
		    return result;
		};
		str.stream()
		        .filter(test)
		        .findFirst()
		        .ifPresent(System.out::print);
			  
	}

}
