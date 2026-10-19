package usingScannerClass_Initialize_InstanceVariables;

import java.util.Scanner;

public class Test_Using_Setter {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("First Student data");
		System.out.println("            ");
		
		System.out.println("Enter First Student Number");
		int id1=sc.nextInt();
		
		System.out.println("Enter First Student Name");
		String name1 = sc.next();
		
		Student s1=new Student();
		s1.setId(id1);
		s1.setName(name1);
		System.out.println(s1.getId()+"  "+s1.getName());
		System.out.println(s1);
		
		
		//---------------------------------------------------
		System.out.println("Second Student data");
		System.out.println("            ");
		
		System.out.println("Enter Second Student Number");
		int id2=sc.nextInt();
		
		System.out.println("Enter First Student Name");
		String name2 = sc.next();
		
		Student s2=new Student();
		s2.setId(id2);
		s2.setName(name2);
		System.out.println(s2.getId()+"  "+s2.getName());
		System.out.println(s2);
		
		
		
		
	}

}
