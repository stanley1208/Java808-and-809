package package10;

import java.util.Enumeration;
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

public class ex14 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Locale currentLocale=new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
		Enumeration<String> names=messages.getKeys();
		while(names.hasMoreElements()) {
			String key=names.nextElement();
			String name=messages.getString(key);
			System.out.println(key+"="+name);
		}
	}

}



