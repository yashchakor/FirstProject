package multithreading;

public class Runnable_Using_Lambda  {
	
	
	public static void main(String[] args) {
		
		Runnable r=()->{   for (int i = 0; i <50; i++) {
			
			System.out.println(" Thread");
			
		}};
		
		Thread t=new Thread(r);
		t.start();
		
		for (int i = 0; i < 50; i++) {
	    	System.out.println(" Main Thread....");
			
		}
		
		
	}

}
