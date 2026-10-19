package switchCase;

import java.util.Scanner;

public class Demo {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            System.out.println("Enter 1 for Marathi");
	            System.out.println("Enter 2 for Hindi");
	            System.out.println("Enter 3 for English");
	            System.out.println("Enter 4 for Spanish");
	            System.out.println("Enter 5 for Gujarati");
	            System.out.println("Enter 6 for Telugu");

	            int input = sc.nextInt();

	            switch (input) {

	                case 1:
	                    System.out.println("Marathi");
	                    break;

	                case 2:
	                    System.out.println("Hindi");
	                    break;

	                case 3:
	                    System.out.println("English");
	                    break;

	                case 4:
	                    System.out.println("Spanish");
	                    break;

	                case 5:
	                    System.out.println("Gujarati");
	                    break;

	                case 6:
	                    System.out.println("Telugu");
	                    break;
	                default:
	                    System.out.println("Enter valid input");
	                    break;
	            }
	        }
	    }
	}


