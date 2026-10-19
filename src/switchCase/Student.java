package switchCase;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("enter signal");
		Scanner sc = new Scanner(System.in);
		String signal = sc.next().toUpperCase();
		Signal input = Signal.valueOf(signal);

		switch (input) {

		case RED:
			System.out.println("Stop");
			break;
		case GREEN:
			System.out.println("GO");
			break;
		case AMBER:
			System.out.println("READY");
			break;
		default:
			System.out.println("enter valid details");
			break;
		}

	}

}
