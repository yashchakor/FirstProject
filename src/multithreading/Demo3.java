package multithreading;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		SecondThread t = new SecondThread();
		t.start();
		t.join();

		for (int i = 0; i < 5; i++) {

			System.out.println("reading file");

		}

	}

}
