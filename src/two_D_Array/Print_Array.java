package two_D_Array;

import java.util.Arrays;

public class Print_Array {
	
	
	
	public static void main(String[] args) {
		
		
		
		int [][]arr= {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
				
		};
		
		
		System.out.println(" -------------------------------------------------------");
		
		
	System.out.println(" print using enhance for loop and to string");	
		
		for(int[]arr2:arr) {
			
			System.out.println(Arrays.toString(arr2));
			
			
		}
		
   System.out.println(" print using enhance for loop");	
		
		for(int[]arr2:arr) {
			
			for(int x:arr2)	{
				
				System.out.print(x);
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("print using for loop");
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		System.out.println("print using index");
		
		
		
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		
		System.out.println("print using stream");
		
		
		Arrays.stream(arr).forEach(arr2->{
			
			Arrays.stream(arr2).forEach(System.out::println);
			
		});
		
		
		
	}

}
