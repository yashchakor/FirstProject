package multithreading;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Thread_Using_ThreadClass t= new Thread_Using_ThreadClass();
		t.start();
		
		
		for (int i = 0; i < 50; i++) {
	    	System.out.println(" Main Thread....");
			
		}
		
		
		
	}

}
