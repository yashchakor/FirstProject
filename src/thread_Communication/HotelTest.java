package thread_Communication;

public class HotelTest {

	public static void main(String[] args) throws InterruptedException {

		Hotel h = new Hotel();

		Thread customer1 = new Thread(() -> {
			try {
				h.waitigForFood("Yash");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

		);

		Thread customer2 = new Thread(() -> {
			try {
				h.waitigForFood("Ramesh");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		);

		Thread customer3 = new Thread(() -> {
			try {
				h.waitigForFood("Chakor");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		);
		Thread waiter = new Thread(() -> {
			h.prepareFood();

		}

		);

		customer1.start();
		customer2.start();
		customer3.start();

		Thread.sleep(10000);

		waiter.start();

	}

}
