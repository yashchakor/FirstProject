package mock;

public class TestCounter {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			

			for (int i = 1; i <= 2000; i++) {

				c.increaseCount();

				if (i == 2000) {

					System.out.println("tl = " + c.count);

				}
				
				else if(i==4000) {
					
					System.out.println("t1 = "+c.count);
					
					
				}

			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 1; i <= 2000; i++) {

				c.increaseCount();
				
				if (i == 2000) {

					System.out.println("t2 = " + c.count);

				}
				
				else if(i==4000) {
					
					System.out.println("t2 = "+c.count);
					
					
				}


			}

		});

		t1.start();
		t2.start();
		
		

		t1.join();
		
		t2.join();

		System.out.println(c.count);

	}

}
