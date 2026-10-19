package multithreading;

public class PrintDocumentTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		PrintDocument p=new PrintDocument();
		
		Thread t1=new Thread(()->{
			
			try {
				p.waitingForPrinting();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		
		Thread t2=new Thread(()->{
			
			p.printer();
			
		});
		
		t1.start();
		
		Thread.sleep(5000);
		
		t2.start();
		
	}
}
