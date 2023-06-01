package package12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex10 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		Stream.of(list1, list2)
		.flatMap(list -> list.stream())
		.forEach(s -> System.out.print(s + " "));
	}

}
