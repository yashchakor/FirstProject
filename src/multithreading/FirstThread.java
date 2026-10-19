package multithreading;

public class FirstThread extends Thread{
	
	@Override
	public void run() {
		
	
		
		for (int i = 0; i < 500; i++) {
			System.out.println(" FirstThread");
			Thread.yield();
			
		}
		
	}
	
	

}
