package array;

import java.util.Scanner;

public class Employee_Data_Array {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many Employee you want to add");
		
		int baseValue=sc.nextInt();
		Employee_Data [] emp=new Employee_Data[baseValue];
		
		for (int i = 0; i < emp.length; i++) {
			
			System.out.println("enter"+(i+1)+"employee name");
			
			String name=sc.next();
			System.out.println("enter"+(i+1)+"employee department");
			
			String department=sc.next();
			System.out.println("enter"+(i+1)+"employee salary");
			double salary=sc.nextDouble();
			
			emp[i]=new Employee_Data(name,department,salary);

		}
		
		
		for (int i = 0; i < emp.length; i++) {
			
			System.out.println(emp[i].getName()+"  "+emp[i].getDepartment()+"  "+emp[i].getSalary());
			
		}
		
		
		
		
	}

}
