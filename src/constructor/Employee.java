package constructor;

public class Employee {
	
	int id;
	String emloyeeName;
	double salary;
	String villageName;
	
	public Employee(int id ,String emloyeeName,double salary,String villageName) {
		
		this.id=id;
		this.emloyeeName=emloyeeName;
		this.salary=salary;
		this.villageName=villageName;
		
		
	}
	
	
	public static void main(String[] args) {
		Employee e= new Employee(1,"yash",20555.0,"mandavgaon");
		System.out.println(e.emloyeeName+"  "+e.id+"  "+e.salary+"  "+e.villageName);
	}

}
