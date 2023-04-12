package package10;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ex8 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Locale u=Locale.CANADA;
		Locale u2=new Locale("en","US");
		System.out.println(u);
		System.out.println(u2);
	}

}

/*
Which two statements are true about localizing an application?

A. Support for new regional languages does not require recompilation of the code.
B. Textual elements (messages and GUI labels) are hard-coded in the code.
C. Language and region-specific programs are created using localized data.
D. Resource bundle files include data and currency information.
E. Language codes use lowercase letters and region codes use uppercase letters.



*/
