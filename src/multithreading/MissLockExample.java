package multithreading;

public class MissLockExample {
	
	
	public static void main(String[] args) {
		
		Greet g=new Greet();
		
		MissLock t1=new MissLock(g, "Yash");
		MissLock t2=new MissLock(g, "Ramesh");
		MissLock t3=new MissLock(g, "Chakor");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
