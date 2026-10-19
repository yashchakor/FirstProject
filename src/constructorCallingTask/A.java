package constructorCallingTask;

public class A {
	
	
	public A(int x) {
		
		
		System.out.println("int a class");
		
	}
	
	
	public A(boolean b) {
		this(10);
		
		System.out.println("boolean a class");
		
	}
	
	

}
