package mock;

public class Child extends Parent {

	public void multiplication() {

		int a = 2;
		int b = 4;

		System.out.println(a * b);

	}

	public static void main(String[] args) {

		Child c = new Child();
		c.add();
		c.substract();
		c.multiplication();

	}

}
