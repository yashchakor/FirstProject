package multithreading;

public class PrintDocument {

	public synchronized void waitingForPrinting() throws InterruptedException {

		System.out.println(" printer is busy please wait");

		wait();

		System.out.println(" Printing operation is Done");

	}

	public synchronized void printer() {

		

		System.out.println(" I am trying to make printer Free");

		notify();

		System.out.println(" Notification Send");

	}

}
