package if_else;

import java.util.Scanner;

public class Demo {
	
	public static  boolean isPass(Student s) {
		
		if(s.getMarks()<35) {
			return false;
		}
		
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int id=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
		
		if(isPass(new Student(id,name,marks))) {
			System.out.println("pass");
			
		}
		
		else {
			System.out.println("fail");
		}
		
		
		
		
	}

}
