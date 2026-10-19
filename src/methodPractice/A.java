package methodPractice;

public class A {
	
	//use of this and super for method &variable calling
	
	int id=10;
	static String name;
	
	public void set() {
		System.out.println("a class set method");
		
	}
	
	
	public void get() {
		this.set();
		
		System.out.println("a class get method");
		
		
		
	}

}
