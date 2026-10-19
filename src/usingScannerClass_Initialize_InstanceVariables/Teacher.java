package usingScannerClass_Initialize_InstanceVariables;

public class Teacher {
	
	int id;
	String teacherName;
	public Teacher(int id, String teacherName) {
		super();
		this.id = id;
		this.teacherName = teacherName;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	

}
