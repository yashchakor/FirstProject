package selfChallenge;

public class Test {
	
	
	public void getData(Student ...s) {
		System.out.println("get data method");
		
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.getData(new Student(102,"yash"));
		t.getData(null);
		Student s=new Student();
		Student s1=new Student();

		
		t.getData(s,s1);
		
		
	}

}
