package usingScannerClass_Initialize_InstanceVariables;

public class University {
	
	int id;
	String universityName;
	College college;
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(int id, String universityName, College college) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	
	
	
	
	

}
