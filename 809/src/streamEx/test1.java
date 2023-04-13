package streamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
//		List<Integer> l=new ArrayList<>();
//		l.add(30);
//		l.add(20);
//		l.add(60);
		
//		List<Integer> l=Arrays.asList(30,20,60,80,100);
		
		Arrays.asList(30,20,60,80,100)
		.stream()
		.filter(t->t>30)
		.sorted()
		.forEach(System.out::println);
		
//		for(Integer o:l) {
//			System.out.println(o);
//		}
		
		
	}

}
