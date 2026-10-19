package thread_Communication;

public class PrinterTest {

	public static void main(String[] args) throws InterruptedException {

		PrinterExample p = new PrinterExample();

		Thread user = new Thread(() -> {

			try {
				p.printDocument();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		});

		Thread admin = new Thread(() -> {

			p.makePrinterFree();

		}

		);

		user.start();

		Thread.sleep(10000);

		admin.start();

	}

}
