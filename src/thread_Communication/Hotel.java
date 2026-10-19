package thread_Communication;

public class Hotel {

	public synchronized void waitigForFood(String name) throws InterruptedException {

		System.out.println("customer " + " " + name + " " + "is waiting for food");
		wait();
		System.out.println("customer " + " " + name + " " + "is Enjoying the meal");


	}

	public synchronized void prepareFood() {

		System.out.println(" food is being prepared");

		notifyAll();

	}

}
