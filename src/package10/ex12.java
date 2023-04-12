package package10;

import java.time.LocalTime;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import static java.time.temporal.ChronoUnit.*;


public class ex12 {

	public static void main(String[] args) throws Exception, ExecutionException {
		LocalTime now=LocalTime.now();
		long timeToBreakfast=0;
		
		LocalTime office_start=LocalTime.of(7, 30);
		if(office_start.isAfter(now)) {
			timeToBreakfast=now.until(office_start,MINUTES);
		}else {
			timeToBreakfast=now.until(office_start,HOURS);
		}
		
		System.out.println(timeToBreakfast);
	}

}



