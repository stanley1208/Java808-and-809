package package12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex9 {

	public static void main(String[] args) {
		List<String>colors=Arrays.asList("red","green","yellow");
		Predicate<String>test=n->{
			System.out.println("Searching...");
			return n.contains("red");
		};
		
		colors.stream()
			  .filter(c->c.length()>3)
			  .allMatch(test);
			  
	}

}
