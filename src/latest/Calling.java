package latest;

public class Calling {

	public void m1() {

		System.out.println("m1 method get called");
	}

	public void m2() {
		m1();

		System.out.println("m2 method get called");
	}

	public void m3() {
		m2();

		System.out.println("m3 method get called");
	}

	public static void main(String[] args) {
		
		Calling c=new Calling();
		c.m3();

	}

}
