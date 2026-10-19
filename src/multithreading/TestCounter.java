package multithreading;

public class TestCounter {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 2000; i++) {

				c.increaseCounter();

			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 1; i <= 2000; i++) {

				c.increaseCounter();

			}

		});

		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.count);

	}

}
