package package10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ex9 {

	public static void main(String[] args) throws Exception, ExecutionException {
		BiFunction<Integer, Double, Double> val = (t1, t2) -> t1 + t2; // line n1
		System.out.println(val.apply(10, 10.5));
	}

}


