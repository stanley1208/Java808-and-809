package package10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.UnaryOperator;

public class ex5 {

	public static void main(String[] args) throws Exception, ExecutionException {
		List<Integer>codes=Arrays.asList(10,20);
		UnaryOperator<Integer>uo=s->s+10;
		codes.replaceAll(uo);
		codes.forEach(c->System.out.println(c));
	}

}


