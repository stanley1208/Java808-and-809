package package10;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ex16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		double d=15;
		Locale l=new Locale("en","US");
		NumberFormat formatter=NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));
	}

}



