package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_Using_ExecuterService {
	
	
	
	public static void main(String[] args) {
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		
		
		e.execute(()-> System.out.println(" Download File"+"  =  " +Thread.currentThread().getName()));
		e.execute(()-> System.out.println(" Play Music"+ "  =  "+Thread.currentThread().getName()));
		e.execute(()-> System.out.println(" Read File"+"   =  "+Thread.currentThread().getName()));
		e.execute(()-> System.out.println(" Watching movie"+"   =  "+Thread.currentThread().getName()));
		e.execute(()-> System.out.println(" Open Task manager"+"   =   "+Thread.currentThread().getName()));
		
		e.shutdown();
	}

}
