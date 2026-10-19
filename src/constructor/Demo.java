package constructor;

public class Demo {
	
	Demo (){
		this (100);
		System.out.println("no parametarized constructor called");
	}
	Demo (int x){
		System.out.println(" parametarized constructor called");
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		
	}

}
