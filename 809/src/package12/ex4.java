package package12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.protobuf.Empty;

public class ex4 {

	public static void main(String[] args) {
		List<emp> li=Arrays.asList(
				new emp("Sam", 20),
				new emp("John", 60),
				new emp("Jim", 51)
				);
		
		Predicate<emp>agVal=s->s.getEAge()>50;
		
		li=li.stream()
				.filter(agVal)
				.collect(Collectors.toList());
		
		Stream<String>names=li.stream()
				.map(emp::getEName);
		names.forEach(n->System.out.println(n));
		

	}

}

class emp{
	
	private String eName;
	private Integer eAge;
	
	emp(String eN,Integer eA){
		this.eAge=eA;
		this.eName=eN;
	}
	
	public Integer getEAge() {
		return eAge;
	}
	
	public String getEName() {
		return eName;
	}
}
