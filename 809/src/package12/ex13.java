package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex13 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList("DOC", "MPEG", "JPEG");
		codes.forEach(c -> System.out.print(c + " "));
		String fmt = codes.stream()
		        .filter(s -> s.contains("PEG"))
		        .reduce((s, t) -> s + t).get();
		System.out.println("\n" + fmt);
						
	}

}



