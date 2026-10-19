package switchCase;

import java.util.Scanner;

public class Shift {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1=for addition");
		System.out.println("2=for multiplication");
		System.out.println("3=for division");
		System.out.println("4=for Substraction");
		
		int input =sc.nextInt();
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		switch(input){
		
		case 1:
			int sum=ArithematicOperation.addition(num1, num2);
			System.out.println("Addition is "+sum);
			break;
		case 2:
			int mul=ArithematicOperation.multipication(num1, num2);
			System.out.println("multipication is "+mul);
			break;
		case 3:
			int div=ArithematicOperation.division(num1, num2);
			System.out.println("division is "+div);
			break;
		case 4:
			int sub=ArithematicOperation.substraction(num1, num2);
			System.out.println("substraction is "+sub);
			break;
			
			default:
				System.out.println("enter valid details");
				break;
		
		}
		
	}
}
