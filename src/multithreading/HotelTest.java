package multithreading;

public class HotelTest {

	public static void main(String[] args) throws InterruptedException {

		Hotel h = new Hotel();

		Thread t1 = new Thread(() -> {

			try {
				h.customerWaiting("Yash");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		});
		Thread t2 = new Thread(() -> {

			try {
				h.customerWaiting("Ramesh");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		});
		Thread t3 = new Thread(() -> {

			try {
				h.customerWaiting("Chakor");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		});
		
		Thread t4 =new Thread(()->{
			
			h.waiter();
			
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(5000);
		
		t4.start();

	}

}
