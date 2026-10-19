package secondaryRefrence;

public class College {
	int id;
	String collegeName;
	Teacher teacher;
	public College(int id, String collegeName, Teacher teacher) {
		super();
		this.id = id;
		this.collegeName = collegeName;
		this.teacher = teacher;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
