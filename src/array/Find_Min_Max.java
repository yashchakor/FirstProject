package array;

import java.util.Arrays;

public class Find_Min_Max {
	
	
	
	
	public static void main(String[] args) {
		
		
		int[] a= {1,5,7,2,9,8};
		
		Arrays.sort(a);//[1, 2, 5, 7, 8, 9]
		
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("------------------------");	
		System.out.println(a[a.length-1]);//max
		System.out.println(a[a.length-2]);//second max
		System.out.println(a[a.length-3]);// third max
		
		System.out.println("------------------------------");
		System.out.println(a[0]);//min
		System.out.println(a[1]);//second min
		System.out.println(a[2]);//third min

		System.out.println("------------------------------");

		
		System.out.println(a[(a.length-1)/2]);// middle num

		
		
	}

}
