package switchCase;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Welcome To Abhi's kitchen");
		System.out.println();
		System.out.println("Select 1: For Dinner");
		System.out.println("Select 2:for Starter");

		int num = sc.nextInt();

		switch (num) {

		case 1:
			
			System.out.println("Select 1: For Nonveg");
			System.out.println("Select 2: For Veg");
			int num1 = sc.nextInt();

			if (num1 == 1) {

				System.out.println(" Nonveg Menu");
				System.out.println();
				System.out.println("Select 1 : For Chicken Menu ");
				System.out.println("Select 2 : For Matan Menu");

				int num2 = sc.nextInt();
				switch (num2) {

				case 1:

					System.out.println("Chicken =>");
					System.out.println();
					System.out.println("Chicken Thali   = 90  RS ");
					System.out.println("Chicken Tandoor = 650 RS");
					System.out.println("Chicken Handi   = 250 Rs");

					break;

				case 2:

					System.out.println("Matan   =>");
					System.out.println();
					System.out.println("Matan Thali     = 350 RS ");
					System.out.println("Matan Handi     = 450 RS");

					break;
				
				}

			}

			
			else if(num1==2) {
					System.out.println("Veg Menu");
				
					System.out.println("Paneer kofta  = 130 RS");
					System.out.println("veg Biryani   = 100 RS");
					System.out.println("Kaju cari     = 160 RS");
					System.out.println("Paneer Tikka  = 190 RS");
			}	
					else {
						System.err.println("Please Selsect right Option");
					}
			break;
				
		case 2:
			
			System.out.println("Starter Menu");
			System.out.println();
			System.out.println("Masala Papad = 40 RS");
			System.out.println("Tea          = 20 Rs");
			break;

		}
		
		}	

	}

}
