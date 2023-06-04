package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex21 {

	public static void main(String[] args) {
		List<Person> prog=Arrays.asList(
				new Person("Smith",1500),
				new Person("John",2000),
				new Person("Joe",1000));
		double dVal=prog.stream()
					.filter(s->s.getFirstName().startsWith("J"))
					.mapToInt(Person::getSalary)
					.average()
					.getAsDouble();
		System.out.println(dVal);
					
	}
}

class Person{
	private String firstName;
	private int salary;
	public Person(String fN,int sal)
	{
		this.firstName=fN;
		this.salary=sal;
	
	}
	
	public int getSalary() {return salary;}
	public String getFirstName() { return firstName;}
	
}



