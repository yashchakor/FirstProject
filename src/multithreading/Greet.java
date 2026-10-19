package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Greet {
	
	
	Lock l=new ReentrantLock();
	
	public void demo(String name) {
		
		l.lock();
		
		for (int i = 0; i <=20; i++) {
			System.out.println(name);
			
		}
		
		l.unlock();
	}
	

}
