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
		List<Emp2> emp = Arrays.asList(
		        new Emp2("John", "Smith"),
		        new Emp2("Peter", "Sam"),
		        new Emp2("Thomas", "Wale"));
		emp.stream()
		.sorted(Comparator.comparing(Emp2::getfName).reversed().thenComparing(Emp2::getlName))		
		.collect(Collectors.toList());
			  
	}

}

class Emp2 {
	 
    String fName;
    String lName;
 
    public Emp2(String fn, String ln) {
        fName = fn;
        lName = ln;
    }
 
    public String getfName() {
        return fName;
    }
 
    public String getlName() {
        return lName;
    }
}
