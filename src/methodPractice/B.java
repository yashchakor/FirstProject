package methodPractice;

public class B extends A{
	
	
	public void demo(){
		super.get();
		System.out.println("demo method called");
		
		
	}
	
	public void get() {
		this.demo();
		
		
		System.out.println("b class get method");
		System.out.println(super.id);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.get();
		
	
		
		
	}
	
	
	

}
