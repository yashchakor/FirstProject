package Practice;

public class B extends A{
	
	
	public void m1() {
		System.out.println(super.id);
	}
	
	
	public static void main(String[] args) {
		A a=new A() ;
			a.id=10;
			a.name="priyu";
			
			System.out.println(a.id+"  "+a.name);
			
			A a3=new A() ;
			a3.id=1;
			a3.name="sakshi";
			System.out.println(a3.id+"  "+a3.name);
			
			A a1=new A(20,"Satvashila") ;
			System.out.println(a1.id+"  "+a1.name);
			
			B b=new B();
			b.m1();
			
			
		
		
	}

}
