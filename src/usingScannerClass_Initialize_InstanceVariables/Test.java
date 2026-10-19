package usingScannerClass_Initialize_InstanceVariables;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter  Teacher Id");
		
		int idt=sc.nextInt();
		System.out.println("Enter  Teacher Name");
		String namet=sc.next();	
		
		Teacher t=new Teacher(idt,namet);
		System.out.println(t.getId());
		System.out.println(t.getTeacherName());
		
		System.out.println("Enter  College Id");
		int idc=sc.nextInt();
		System.out.println("Enter  College Name");
		String namec=sc.next();
		
		
		College c=new College(idc,namec,t);
		System.out.println(c.getId());
		System.out.println(c.getCollegeName());
		
		System.out.println("Enter University id");
		int idu=sc.nextInt();
		System.out.println("Enter University Name");
		String nameu=sc.next();
		University u=new University(idu,nameu,c);
		
		System.out.println(u.getId());
		System.out.println(u.getUniversityName());
		
	}

}
