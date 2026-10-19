package array;

import java.util.Arrays;
import java.util.Iterator;

public class Char_Array {
	
	
	public static void main(String[] args) {
		
		
		char [] c= {'a','f','$',' ','6'};
		
		
		System.out.println(" length of array is = "+c.length);
		
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using index");
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using for loop");
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]);
			
		}
		
		System.out.println("-------------------------------");

		System.out.println(" print using enhance for loop");
		
		
		for(char y:c) {
			System.out.println(y);
			
		}
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using Arrays:utility method");
		
		System.out.println(Arrays.toString(c));
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
