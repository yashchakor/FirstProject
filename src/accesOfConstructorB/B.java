package accesOfConstructorB;

import accesOfConstructorA.A;

public class B extends A  {
	B(){
		System.out.println(" b constructor get called");
	}
	
	
	public static void main(String[] args) {
		B a= new B();
		
	}

}
