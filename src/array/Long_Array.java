package array;

import java.util.Arrays;

public class Long_Array {
	
	
	public static void main(String[] args) {
		
		
		
		long [] s= {356555l,8925655l,542325655l,755423l};
		
		
		System.out.println(" length of array is = "+s.length);
		
		

		System.out.println("-------------------------------");

		System.out.println(" print using index");
		
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);

		
		System.out.println("-------------------------------");

		System.out.println(" print using for loop");
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
		}
		
		System.out.println("-------------------------------");

		System.out.println(" print using for each loop");
		
		for(long y:s) {
			System.out.println(y);
			
			
		}
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using Arrays:utility method");
		
		
		System.out.println(Arrays.toString(s));
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using for each");
		
		
		Arrays.stream(s).forEach(System.out::println);
		
		
	}
	

}
