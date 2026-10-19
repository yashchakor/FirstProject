package if_else;

import java.util.Scanner;

public class Self {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();

		if (marks >= 35 ) {

			if (marks > 100) {
				System.err.println("SERVER ERROR");
			} else {
				System.out.println("pass");
			}

		}

		else {
			System.out.println("fail");

		}

	}

}