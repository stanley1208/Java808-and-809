package package10;

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

public class ex13 {

	public void loadResourcesBundle() {
		ResourceBundle resource=ResourceBundle.getBundle("Greetings",Locale.US);
		System.out.println(resource.getObject("HELLO_MSG"));
		System.out.println(resource.getObject("GOODBYE_MSG"));
	}
	
	public static void main(String[] args) throws Exception, ExecutionException {
		new ex13().loadResourcesBundle();
	
	}

}



