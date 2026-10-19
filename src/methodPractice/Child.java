package methodPractice;

public class Child extends Parent{
	
	int id=10;
	
	
	public void set() {
		int id=100;
		
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.set();
		c.get();
		
		
	}

}
