package package12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex30 {

	public static void main(String[] args) throws IOException {
		List<Integer>prices=Arrays.asList(3,4,5);
		prices.stream()
				.filter(e->e>4)
				.peek(e->System.out.println("Price "+e))
				.map(n->n-1)
				.forEach(n->System.out.println("New Price "+n));
	}
}






