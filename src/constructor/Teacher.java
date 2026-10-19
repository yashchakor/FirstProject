package constructor;

public class Teacher {
	
	int id;
	String name;
	double salary;
	public Teacher(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Teacher t=new Teacher(1,"Prerna",122558.0);
		System.out.println(t.id+"  "+t.name+"  "+t.salary);
		
	}

}
