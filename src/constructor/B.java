package constructor;

public class B extends A {

	public B(int x) {
//		super(10);

		System.out.println("b class constructor get called");

	}

	public static void main(String[] args) {
		B b = new B(10);
	}

}
