package mock;

public class PrinterTest {

	public static void main(String[] args) throws InterruptedException {

		Printer p = new Printer();

		

		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 5000; i++) {

				p.increaseCount();

			}
			System.out.println("t1 ="+p.count);
		});

		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 1; i <= 5000; i++) {

				p.increaseCount();

			}
			System.out.println("t2 ="+p.count);
		});

		t1.start();

		t2.start();

		t1.join();
		t2.join();

		System.out.println("Total Count ="+p.count);

	}

}
