package multithreading;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolOfThread {
	
	public static void main(String[] args) {
		
			ExecutorService e = Executors.newFixedThreadPool(2);
			
			
			
			for (int i = 1; i <=5; i++) {
				
				int task=i;
				
				e.execute(()-> System.out.println(" Task " + "  "+task+"  "+Thread.currentThread().getName()));
				
				
			}
			
		
		
		
	}

}
