package thread_Communication;

public class PrinterExample {

	public synchronized void printDocument() throws InterruptedException {

		System.out.println(" printer is busy please wait..");
		this.wait();// immediately lock release.. waiting state

		System.out.println(" document print operation done");

	}

	public synchronized void makePrinterFree() {

		System.out.println(" I am trying to make printer available..");

		this.notify();
		System.out.println(" Notification send..");

	}

}
