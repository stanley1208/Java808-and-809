package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex17 {
	
	
	public static void main(String[] args) {
			List<Person>emps=new ArrayList<>();
			Collections.sort(emps);
		}
	
	

}

class Person implements Comparable<Person>{
	String name;
	Person(String name){
		this.name=name;
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareTo(p.name);
	}
	
}



	






