package multithreading;

public class Hotel {

	public synchronized void customerWaiting(String name) throws InterruptedException {

		System.out.println(" customer " + name + " is waiting");
		wait();
		System.out.println(" customer " + name + " is enjoing food");

	}

	public synchronized void waiter() {

		System.out.println(" food is prepared");

		notifyAll();
		
		System.out.println(" fodd is ready");

	}

}
