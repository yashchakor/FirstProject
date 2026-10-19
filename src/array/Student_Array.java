package array;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Array {
	
	
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first student details");
		
		int s1Id=sc.nextInt();
		String s1Name=sc.next();
		
		System.out.println("Enter second student details");
		
		int s2Id=sc.nextInt();
		String s2Name=sc.next();
		
		System.out.println("Enter third student details");
		
		int s3Id=sc.nextInt();
		String s3Name=sc.next();
		
		Student s1=new Student(s1Id ,s1Name);
		Student s2=new Student(s2Id,s2Name);
		Student s3=new Student(s3Id,s3Name);
		
		
		Student [] stu= {s1,s2,s3};
		
		for (int i = 0; i < stu.length; i++) {
			
			System.out.println(stu[i].getStuId()+"  "+stu[i].getStuName());
			
		}

	}

}
