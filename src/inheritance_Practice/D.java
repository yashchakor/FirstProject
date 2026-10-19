package inheritance_Practice;

public class D extends B{
	
	
	public void m1() {
		
		super.m1();
		System.out.println(" m1 from D class");
	}
	
	
	public static void main(String[] args) {
		
		D d=new D();
		d.m1();
		
	}

}

