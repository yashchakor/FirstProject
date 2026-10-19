package operators;

import java.util.Scanner;

public class R1 {
	
	public static  boolean isPass(int marks) {
		
		if (marks<35) {
			return false;
		}
		else {
			return true;
		}
		
		
		
	}
	

	public static  boolean isPass(int marks) {
		
	boolean a;
	
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int marks=sc.nextInt();
		
		if(isPass(marks)) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
		
		
		
		
	}

}
