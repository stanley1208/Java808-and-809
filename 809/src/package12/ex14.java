package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex14 {

	public static void main(String[] args) {
		List<TechName> tech = Arrays.asList(
		        new TechName("Java-"),
		        new TechName("Oracle DB-"),
		        new TechName("J2EE-")
		);
		Stream<TechName> stre = tech.stream();
		stre.map(a -> a.techName).forEach(System.out::print);}
}

class TechName {
	 
    String techName;
 
    TechName(String techName) {
        this.techName = techName;
    }
}



