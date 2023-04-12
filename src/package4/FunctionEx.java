package package4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionEx {

	public static void main(String[] args) {
		Consumer<Integer> c=(Integer t)->System.out.println("price="+t);
		Function<String,Integer>f=(String n)->Integer.parseInt(n);
		System.out.println(f.apply("3000")+100);
		Predicate<Integer> p=(Integer t)->t>50;
		System.out.println(p.test(100));
		Supplier<String> s=()->"teacher";
		System.out.println(s.get());
	}

}
