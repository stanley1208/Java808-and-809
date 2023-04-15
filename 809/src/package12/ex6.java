package package12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex6 {

	public static void main(String[] args) {
		List<String>listVal=Arrays.asList("Joe","Paul","Alice","Tom","Stanley");
		System.out.println(listVal.stream().filter(x->x.length()>3).count());
		System.out.println(listVal.stream().map(x->x.length()>3).count());
	}

}
