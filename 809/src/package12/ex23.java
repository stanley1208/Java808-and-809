package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex23 {

	public static void main(String[] args) {
		List<String>words=Arrays.asList("win","try","best","luck","do");
		Predicate<String>test1=w->{
			System.out.println("Checking...");
			return w.contains("do");
		};
			
		Predicate<String> test2=(String w)->w.length()>3;
		words.stream()
				.filter(test2)
				.filter(test1)
				.count();
	}
}




