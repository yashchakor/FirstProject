package usingScannerClass_Initialize_InstanceVariables;

import java.util.Scanner;

public class Test_Using_Constructor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
	String	name=sc.next();
	
	
	Student s=new Student(id,name);
	System.out.println(s.id +"  "+s.name);
	System.out.println(s.getId()+"   "+s.getName());
	System.out.println(s);
	
	//--------------------------------------------------------------
	System.out.println("Enter second Student");
	System.out.println("Enter Id");
	int id2=sc.nextInt();
	System.out.println("Enter Name");
	String	name2=sc.next();
	
	Student s1= new Student(id2,name2);
	System.out.println(s.id+"  "+s.name);
	System.out.println(s.getId()+"  "+s.getName());
	System.out.println(s);
	
	
	
	
	}

}
