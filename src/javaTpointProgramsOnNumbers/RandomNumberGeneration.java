package javaTpointProgramsOnNumbers;

import java.util.Scanner;

public class RandomNumberGeneration {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int min=100000;
		int max=999999;
		
		int otp=(int)(Math.random() * (max - min + 1) + min);
		
		System.out.println(otp);
		
		System.out.println("Enter Otp");
		int user=sc.nextInt();
		
		if(otp==user)
			System.out.println("All is well");
		
		
		else {
			System.err.println("Invalid opt");
			
	}
	
		
	}

}
