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

public class ex11 {

	public static void main(String[] args) throws Exception, ExecutionException {
//		Locale locale=new Locale.Builder().setLanguage("en").setRegion("FR").build();
		Locale locale=new Locale("zt","FR");
		Locale.setDefault(locale);
		ResourceBundle resource=ResourceBundle.getBundle("Messages");
		System.out.println(resource.getString("msg"));
	
	}

}



