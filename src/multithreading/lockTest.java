package multithreading;

public class lockTest {

	public static void main(String[] args) {

		lockExample l = new lockExample();

		Thread t1 = new Thread(() -> {

			l.print("yash");

			for (int i = 0; i <= 10; i++) {
				System.err.println("mandavgan");

			}
		});

		Thread t2 = new Thread(() -> {

			l.print("Ramesh");

			for (int i = 0; i <= 10; i++) {
				System.err.println("ukkadgaon");

			}
		});

		Thread t3 = new Thread(() -> {

			l.print("Raju");

			for (int i = 0; i <= 10; i++) {
				System.err.println("Shirur");

			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
