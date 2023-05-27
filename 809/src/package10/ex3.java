package package10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ex3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4); //line n1
	    Future f1 = es.submit(new CallerThread("Call"));
	    String str = f1.get().toString();
	    System.out.println(str);
		
		es.shutdown();
	}

}

class CallerThread implements Callable<String> {
	 
    String str;
 
    public CallerThread(String s) {
        this.str = s;
    }
 
    public String call() throws Exception {
        return str.concat(" Call");
    }
}
