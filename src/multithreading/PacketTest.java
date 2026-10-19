package multithreading;

public class PacketTest {

	public static void main(String[] args) throws InterruptedException {

		Packet p = new Packet();
		Packet p1 = new Packet();

		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 5000; i++) {

				p.increaseCount();
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 1; i <= 5000; i++) {

				p1.increaseCount();
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("t1 = " + p.count + "   " + "t2 = " + p1.count);

	}

}
