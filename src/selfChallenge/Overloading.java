package selfChallenge;

public class Overloading {
	
	
	public Overloading() {
		
		
		System.out.println("no parameterized constructor");
	}
	
	public Overloading(int x) {
		this();
		System.out.println("parameterised int  constructor");
	}
	
	public Overloading(String s) {
		this(1);
		System.out.println(" parameterized string constructor");
	}
	
	public Overloading (Student s) {
		
	}

	
	public static void main(String[] args) {
		
		Overloading o=new Overloading("yash");
		
		
		
		
	}

}
