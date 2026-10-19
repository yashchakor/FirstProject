package array;

import java.util.Arrays;

public class Int_Array {
	
	
	public static void main(String[] args) {
		
		
		
		
		int [] i= {1,2,8,4,5,};
		
		System.out.println();
		
		System.out.println("length of array is = "+i.length);
		
		System.out.println("-------------------------------");
		
		System.out.println(" print using index");
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		
		System.out.println("-------------------------------");

		System.out.println(" print using for loop");
		
		for (int j = 0; j < i.length; j++) {
			
			System.out.println(i[j]);
			
		}

		System.out.println("-------------------------------");

		System.out.println(" print using enhance for loop");
		
		for(int y:i) {
			
			System.out.println(y);
		}
		
		System.out.println("-------------------------------");

		System.out.println(" print using Arrays:utility method");
		
		
		System.out.println(Arrays.toString(i));
		
		
		
		System.out.println("-------------------------------");

		System.out.println(" print using for each");
		
		Arrays.stream(i).forEach(System.out::println);
		
		
		
		
		
	}

}
