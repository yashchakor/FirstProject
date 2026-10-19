package latest;

public class Student {
	static int id;
	public static String name ;
	long ph;
	
public static void setStudentDetail(int id,String name, long ph) {
	
	Student s=new Student();
	s.id=10;
	s.ph=4565;
	s.name="pooja";
	
	
	
	System.out.println(id+name+ph);
	System.out.println(s.ph);
	
	
}

	
	public static void main(String[] args) {
		
		setStudentDetail(1, "Vrushali", 8999151521l);
		
	
	
	}
	

}
