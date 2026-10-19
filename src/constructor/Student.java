package constructor;

public class Student {
	
	
	Student (float f){
		this("yash",1066);
		
		System.out.println("float parameterized constructor  get called");
	}
	
    Student (String name,long mob){
		
		System.out.println("String ,long  parameterized constructor  get called");
	}
    
    Student (char c){
		this(10.0f);
		System.out.println("char parameterized constructor  get called");
	}
	
	
	public static void main(String[] args) {
		Student s= new Student('a');
		
		
	}

}
