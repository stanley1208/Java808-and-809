package package10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.UnaryOperator;

public class ex4 {

	public static void main(String[] args) throws Exception, ExecutionException {
		UnaryOperator<Double> uo1 = s -> s * 2; //line n1
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		loanValues.stream()
		        .filter(lv -> lv >= 1500)
		        .map(lv -> uo1.apply(lv)) //line n2
		        .forEach(s -> System.out.print(s + " "));
	}

}


