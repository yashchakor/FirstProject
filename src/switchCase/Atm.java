package switchCase;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1:for balance");
		System.out.println("2:for deposit");
		System.out.println("3:for Withdraw");
		System.out.println("4:for exit");

		int num = sc.nextInt();

		switch(num) {
		
		case 1:
			System.out.println("RS 30000");
			break;
		case 2:
			System.out.println("Rs 8000");
			break;
		case 3:
			System.out.println("Rs 1000");
			break;
		case 4:
			System.exit(0);
			
		
		
		
		
		}
		}
		
	}

}
