package Shift;

public class Pooja {
	public void set(String... s) {
		System.out.println("method get called");
	}
	
	public static void main(String[] args) {
		Pooja p=new Pooja();
		p.set();
		p.set("swati","komal");
		p.set("aarti");
		
	}

}
