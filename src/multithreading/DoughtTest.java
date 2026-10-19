package multithreading;

public class DoughtTest {
	
	public static void main(String[] args) {
		
		DoughtExample d1=new DoughtExample();
		DoughtExample d2=new DoughtExample();
		DoughtExample d3=new DoughtExample();

		d1.start();
		d2.start();
		d3.start();
		
	}

}
