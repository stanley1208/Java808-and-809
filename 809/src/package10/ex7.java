package package10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex7 implements Runnable{

	String fName;
	
	public ex7(String fName) {
		this.fName=fName;
	}
	
	public void run() {
		System.out.println(fName);
		
	}
	
	public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService executor=Executors.newCachedThreadPool();
		Stream<Path>listOfFiles=Files.walk(Paths.get("C:/Users/user/Documents/java"));
		listOfFiles.forEach(line->{
			executor.execute(new ex7(line.getFileName().toString()));
		});
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS);
	}

	

}


