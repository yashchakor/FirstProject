package if_else;

import java.util.Scanner;

public class Second {
	
	public static boolean isPass(int marks) {
		
		if (marks>=35)	
		return true;
		
		else
			
			return false;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		
		if(isPass(marks))
		System.out.println("pass");
		else
			System.out.println("fail");
		
		
	}

}
