package multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(" MyThread");

		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {

			System.out.println(" MyThread");

		}

	}
}