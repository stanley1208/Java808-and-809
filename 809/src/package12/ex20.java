package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex20 {

	public static void main(String[] args) {
		Stream.of("Java","Unix","Linux")
		.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK:"+s))
//		.findFirst();
		.findAny();
	}
}





