package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex15 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(1,2,3);
		values.stream()
				.map(n->n*2)
				.peek(System.out::print)
				.count();
	}

}





