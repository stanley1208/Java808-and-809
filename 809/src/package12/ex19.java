package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex19 {

	public static void main(String[] args) {
		IntConsumer consumer=e->System.out.println(e);
		Integer value=90;
		ToIntFunction<Integer> funRef=e->e+10;
		  int result=funRef.applyAsInt(value);
		consumer.accept(result);
	}
}





