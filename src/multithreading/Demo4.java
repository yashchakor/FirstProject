package multithreading;

public class Demo4 {

	public static void main(String[] args) {

		Thread_1 t = new Thread_1();

		Thread t1 = new Thread(t);
		t1.start();

		for (int i = 1; i <= 100; i++) {

			System.out.println(" Main Thread..");

		}

	}

}
