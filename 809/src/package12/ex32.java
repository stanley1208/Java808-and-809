package package12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.NameList;


public class ex32 {

	public static void main(String[] args) throws IOException {
		List<Person2>sts=Arrays.asList(
				new Person2("Jack", 30),
				new Person2("Mike Hill", 21),
				new Person2("Thomas Hill", 24)
				);
		Stream<Person2>resList=sts.stream()
								.filter(s->s.getAge()>=25);
		long count=resList
				.filter(s->s.getName().contains("Hill"))
				.count();
		
		System.out.println(count);
	}
}

class Person2{
	String name;
	int age;
	public Person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}






