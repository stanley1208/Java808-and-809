package package11;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ex4 {

	public static void main(String[] args) {
		Thread thread1=new Thread(new MyThread());
		Thread thread2=new Thread(new MyThread());
		Thread thread3=new Thread(new MyThread());
		Thread[] ta= {thread1,thread2,thread3};
		for (int x=0;x<3;x++) {
			ta[x].start();
		}
	}

}

class MyThread implements Runnable{
	private static AtomicInteger count=new AtomicInteger();
	
	public void run() {
		int x=count.incrementAndGet();
		System.out.print(x+" ");
	}
	
}
