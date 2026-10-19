package multithreading;

public class Counter {

	int count;

	public synchronized void increaseCounter() {
		
		
		count++;
	}

}
