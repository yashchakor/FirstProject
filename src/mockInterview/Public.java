package mockInterview;

public class Public {
	
	
	int id;
	String name;
	
	
	
	
	
	public Public(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println(this.id+"  "+this.name);
		
	}
	


	public static void main(String[] args) {
		Public p=new Public(1,"Ramesh");
		Public p1=new Public (2,"Satyajeet");
		Public p3=new Public (3,"Rajesh");
		

		
		
	}

}
