package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex22 {

	public static void main(String[] args) {
		Stream<List<String>>strs=Stream.of(
				Arrays.asList("text1","text2"),
				Arrays.asList("text2","text3")
				);
		Stream<String>bs2=strs
				.filter(b->b.contains("text1"))
				.flatMap(rs->rs.stream());
					
		bs2.forEach(s->System.out.print(s));
	}
}




