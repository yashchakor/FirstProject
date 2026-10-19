package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockExample {
	Lock l = new ReentrantLock();
	public void print(String name) {

//		

		l.lock();

		for (int i = 1; i <= 20; i++) {

			System.out.println(name);

		}

		l.unlock();

	}

}
