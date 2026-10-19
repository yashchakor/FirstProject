package mockInterview;

import java.util.Scanner;

public class Date_22 {
	
	
	public static void show() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		
		char c=sc.next().charAt(0);
		
		if (Character.isUpperCase(c))
			System.out.println(c+" is in uppercase");
			
		else if (Character.isLowerCase(c))
			System.out.println(c+"is loewrcse");
		
		
		else if(Character.isDigit(c))
			System.out.println(c+"is digit");
		
		else 
			System.err.println("invalid input");
		
			
		
			
		
		
	}
	
	public static void main(String[] args) {
		
		show();
		
		
		
		
	}

}
