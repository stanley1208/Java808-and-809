package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex18 {

	public static void main(String[] args) {
		IntStream str=IntStream.of(1,2,3,4);
		Double d=str.average().getAsDouble();
		System.out.println("Average="+d);
	}
}





