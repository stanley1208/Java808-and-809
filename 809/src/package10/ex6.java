package package10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ex6 {

	public static void main(String[] args) throws Exception, ExecutionException {
		IntStream stream=IntStream.of(1,2,3);
		IntFunction<IntUnaryOperator>inFu=x->y->x*y;
		IntStream newStream=stream.map(inFu.apply(10));
		newStream.forEach(System.out::print);
	}

}


