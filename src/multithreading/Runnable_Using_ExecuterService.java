package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runnable_Using_ExecuterService {
	
	public static void main(String[] args) {
		
		ExecutorService e = Executors.newSingleThreadExecutor();
		e.execute(()->System.out.println(" Hello Yash..."));
		e.shutdown();
		
		
		
		
	}
	

}
