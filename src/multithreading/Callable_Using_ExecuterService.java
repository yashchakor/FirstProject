package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_Using_ExecuterService {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		ExecutorService e = Executors.newSingleThreadExecutor();
		Future<String> f = e.submit(()->"Prerna");
		System.out.println(f.get());
		
		e.shutdown();
		
		
	}

}
