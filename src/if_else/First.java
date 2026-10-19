package if_else;

import java.util.Scanner;

public class First {

	public static boolean isPass(int marks) {
		boolean a;
		if (marks >= 35)
			a = true;

		else

			a = false;
		
		return a;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();

		if (isPass(marks))
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
