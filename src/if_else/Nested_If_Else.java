package if_else;

import java.util.Scanner;

public class Nested_If_Else {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Number positive, negative किंवा zero आहे ते check करा.
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		
//		
//		if(num!=0) {
//			
//		
//		if(num>0) 
//			System.out.println("number is positive");
//		
//			else 
//				System.out.println("number is negative");
//			
//		}
//		
//			else 
//				System.out.println("number is zero");
//			
//			
		//Number even किंवा odd आहे ते check करा. Number positive आहे का हेही nested if वापरून check करा.
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("number is even");
//			if(num>0) 
//					System.out.println("number is positive");
//			else if(num<0)
//				System.out.println("number is negative");
//			else
//				System.out.println("number is zero ");
//			
//			}
//			
//			
//			
//		
//		else {
//			System.out.println("number is odd");
//		if(num>0)
//			System.out.println("number is positive");
//		else if (num<0)
//			System.out.println("number is negative");
//		
//		else
//			System.out.println("number is zero");
//		}
//		Person eligible to vote आहे का check करा. Eligible असल्यास citizen आहे का ते check करा.
		
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		
//		System.out.println("Are You Citizen=true/false");
//		boolean citizen=sc.nextBoolean();
//		
//		if(num>=18) {
//			System.out.println("eligible for voting");
//		if(citizen==true)
//			System.out.println("you are citizen");
//		else
//			System.out.println("you are not citizen");
//			
//	}
//		else
//			System.err.println("you are teenager");
//		
		
		//Student pass/fail check करा. Pass असल्यास grade check करा
		
		System.out.println("Enter number");
		int marks=sc.nextInt();
		
		if(marks>=35&&marks<=100) {
			System.out.println("student is pass");
		
		 if(marks>=91&&marks<=100)
			System.out.println("A+");
		else if(marks>=81&&marks<91)
			System.out.println("A");
		else if(marks>=71&&marks<81)
			System.out.println("B+");
		else if(marks>=61&&marks<71)
			System.out.println("B");
		else if(marks>=51&&marks<61)
			System.out.println("C+");
		else if(marks>=41&&marks<51)
			System.out.println("C");
		else if(marks>=35&&marks<41)
			System.out.println("D+");
		else
			System.out.println("D");
		}
		
		else {
			System.err.println("Fail");
		if (marks>=0) 
			System.out.println(marks);
		else
			System.out.println();
		
		}
		
		
		
		
	}
		
	
}
