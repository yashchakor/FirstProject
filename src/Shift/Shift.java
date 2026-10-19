package Shift;

public class Shift {
	
	
	
	public void set(int x) {
		System.out.println("id is= "+x);
		
		
	}
	public void set(String name) {
		System.out.println("name is= "+name);
		
		
	}
	public void set(float salary) {
		System.out.println("salary is= "+salary);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Shift s= new Shift();
		
		s.set(2);
		s.set("yash");
		s.set(120.1f);
		
		
		
		
		
		
	}

}
