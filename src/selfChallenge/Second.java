package selfChallenge;

public class Second {
	
	public static void getData(First f) {
		System.out.println(f.getId()+"  "+f.getName());		
		
	}
	
	
	Second(){
		System.out.println("default constructor"); 
	}
	Second(String name){
		this();
		System.out.println("String parameterized  constructor"); 
	}
	Second(int id){
		this("Savita");
		System.out.println("int parametarized constructor"); 
	}
	
	Second (First f){
		this(1);
		System.out.println(f.getId()+"  "+f.getName());
		
	}
	
	
	
	public static void main(String[] args) {
		getData(new First(101,"Yash"));
		getData(new First(102,"Prerna"));
		getData(new First(103,"Sakshi"));
		getData(new First(104,"Dnyanu"));
		
		new Second(new First(105,"Shubham"));
		

		
		
		
	}

}
