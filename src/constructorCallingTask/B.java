package constructorCallingTask;

public class B extends A {
	
	public B(long l) {
		super(true);
		
		System.out.println("long b class");
		
	}
	
	
	public B (String x) {
		this(10l);
		System.out.println("string b class");
	}

}
