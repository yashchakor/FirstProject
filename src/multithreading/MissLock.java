package multithreading;

public class MissLock extends Thread{
	
	Greet g;
	String name;
	
	public MissLock(Greet g,String name) {
		this.g=g;
		this.name=name;
		
		
	}
	
	
	public void run() {
		
		g.demo(name);
		
	}

}
