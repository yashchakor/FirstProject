package secondaryRefrence;

public class Test {
	
	public static void main(String[] args) {
		Student s=new Student(101,"Prateek");
		Employee e=new Employee("java Developer","Test","kharadi",s);
		System.out.println(e.subject+"  "+e.companyName+"  "+e.address+"   "+e.getStudent().getId()+"  "+e.getStudent().getName());
		
	}

}
