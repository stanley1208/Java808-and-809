package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex26 {

	public static void main(String[] args) {
		List<String>cs=Arrays.asList("Java","Java EE","Java ME");
		boolean b=cs.stream().allMatch(w->w.equals("Java"));
		System.out.println(b);
		boolean b2=cs.stream().findAny().get().equals("Java");
		System.out.println(b2);
		boolean b3=cs.stream().findFirst().get().equals("Java");
		System.out.println(b3);
		boolean b4=cs.stream().anyMatch(w->w.equals("Java"));
		System.out.println(b4);
	}
}






