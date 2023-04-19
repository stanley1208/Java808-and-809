package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex12 {

	public static void main(String[] args) {
		List<emp2>emp=Arrays.asList(
				new emp2("John", "Smith"),
				new emp2("Peter", "Sam"),
				new emp2("Thomas", "Wale")
				);
		emp.stream()
		.sorted(Comparator.comparing(emp2::getfName).reversed().thenComparing(emp2::getlName))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t.getfName()+" "+t.getlName()));
			  
	}

}

class emp2{
	String fName;
	String lName;
	
	public emp2(String fn,String ln) {
		fName=fn;
		lName=ln;
	}
	
	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
}
