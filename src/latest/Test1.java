package latest;

public class Test1 {
	
	public static void printEmployeeData(Employee employee) {
		System.out.println(employee.id+"  "+employee.name+"  "+employee.salary);
		
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.id=50;
		e.name="prerna";
		e.salary=800000;
		
	printEmployeeData(e);
	
		
	}

}
