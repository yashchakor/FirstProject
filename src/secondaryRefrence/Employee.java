package secondaryRefrence;

public class Employee {
	
	String subject;
	String companyName;
	String address;
	Student student;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String subject, String companyName, String address, Student student) {
		super();
		this.subject = subject;
		this.companyName = companyName;
		this.address = address;
		this.student = student;
	}
	
	
	
	
	
	

}
