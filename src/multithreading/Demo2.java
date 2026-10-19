package multithreading;

public class Demo2 {

	public static void main(String[] args) {

		FirstThread t = new FirstThread();

		t.start();

		for (int i = 0; i < 500; i++) {

			System.out.println(" Main Thread");

		}

	}

}
