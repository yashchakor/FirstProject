package selfChallenge;

public class Demo {
	
	public void setValues(Student s,Student s1,Student s2) {
		s.id=101;
		s.name="yash";
		System.out.println(s.id);
		System.out.println(s.name);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		
		
		
	}
	
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Demo(Student s) {
		id=s;
		
		
		
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		
		Student s1=new Student();
		s1.id=102;
		s1.name="geet";
		
		Student s2=new Student();
		s2.id=103;
		s2.name="prerna";
		
		
		Demo d=new Demo();
		d.setValues(s,s1,s2);
		
		
		
		d.setValues(s,s1,s2);
		Demo d1=new Demo(s2);

		
		
		
	}

}
