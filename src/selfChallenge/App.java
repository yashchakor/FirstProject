package selfChallenge;

public class App {
	
	public Employee getEmployee(Employee e) {
		
		
		return e;
	}
	
	public App() {
		
		Employee e=new Employee(101,"yash","1011");
		
		Employee x = getEmployee(e);
		System.out.println(x.getEmployeeId());
		System.out.println(x.getEmployeeName());
		System.out.println(x.salary);
	}
	
	
	public static void main(String[] args) {
		
		App a=new App();
	}

}
