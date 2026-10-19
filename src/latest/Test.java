package latest;

public class Test {
	
	public static Employee getEmployeeData() {
		Employee e=new Employee();
		e.id=10;
		e.name="pooja";
		e.salary=50000;
		return e;
	}
	
	public static void main(String[] args) {
		Employee e=getEmployeeData();
		System.out.println(e.id+ "  "+"  "+e.name+"  "+e.salary);
	}

}
