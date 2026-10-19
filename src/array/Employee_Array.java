package array;

import java.util.Arrays;

public class Employee_Array {
	
	
	public static void main(String[] args) {
		
		
		Employee e1=new Employee(101,"Pooja");
		
		Employee e2=new Employee(102,"Prerna");
		Employee e3=new Employee(103,"Darshana");
		
		
		Employee [] emp={e1,e2,e3};
		
		
		
		System.out.println("length is = "+emp.length);
		System.out.println("----------------------------");
		System.out.println(emp[0].getEmpId());
		System.out.println(emp[0].getEmpName());

		System.out.println(emp[1].getEmpId());
		System.out.println(emp[1].getEmpName());
		System.out.println(emp[2].getEmpId());
		System.out.println(emp[2].getEmpName());
		
		System.out.println("---------------");
		
		System.out.println("print using for loop");
		
		
		for (int i = 0; i < emp.length; i++) {
			
			
			System.out.println(emp[i].getEmpId()+"  "+emp[i].getEmpName());
			
		}
		
		
		System.out.println("---------------");
		
		System.out.println("print using for each loop");
		
		for(Employee y:emp) {
			
			System.out.println(y.getEmpId()+"  "+y.getEmpName());
		}
		
		
		System.out.println("---------------");
		
		System.out.println("print using Arrays:utility method");
		
		System.out.println(Arrays.toString(emp));
		
		
		System.out.println("---------------");
		
		
		System.out.println("print using for each");
		
		Arrays.stream(emp).forEach(s->{
			
			System.out.println(s.getEmpId()+"  "+s.getEmpName());
			
			
		});
		
		
		
		
		
		
	}

}
