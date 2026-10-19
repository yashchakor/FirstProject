package switchCase;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Char");

        char c = sc.next().charAt(0);

        char ch = Character.toLowerCase(c);

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
                break;
        }
    }
}