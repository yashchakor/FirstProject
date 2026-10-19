package constructor;

public class Test {
	
	Test (){
		System.out.println("no parametarized constructor called");
	}
	
	Test (int x){
		System.out.println(" parametarized constructor called");
	}
	
	Test (String name,int d){
		System.out.println("parametarized constructor called");
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		Test t1=new Test(10);
		Test t2=new Test("yash",30);
		
		
	}

}
