package three_D_Array;

import java.util.Arrays;

public class Print_Array {
	
	
	public static void main(String[] args) {
		
		
		
		int [][][] arr= { {{1,2}  ,{3,4}   },  {{5,6},{7,8}}  };
		
		
		
		
		System.out.println("print using enhance for loop");
		for(int [][]arr1:arr) {
			
			for(int []arr2:arr1) {
				
				
				for(int y:arr2) {
					
					
					System.out.println(y);
				}
			}
			
			
		}
		
		System.out.println("print using for loop");
		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr[i].length; j++) {
				
				for (int k = 0; k < arr[i][j].length; k++) {
					
					System.out.println(arr[i][j][k]);
					
					
					
				}
				
				
				
			System.out.println("print using to String");	
			
			
			for(int [][]arr1:arr) {
				
				for(int []arr2:arr1) {
					
					
					System.out.println(Arrays.toString(arr2));
				}
				
				
			}
				
			
			
			
			
			System.out.println("print using stream");
			
			
			Arrays.stream(arr).forEach(arr2->{
				
			Arrays.stream(arr2).forEach(arr3->{
				
				Arrays.stream(arr3).forEach(System.out::println);
			});
				
			});
			
				
				
			}
		}
		
		
		
		
		System.out.println("print using index");
		
		
		System.out.println(arr[0][0][0]);
		System.out.println(arr[0][0][1]);
		System.out.println(arr[0][1][0]);
		System.out.println(arr[0][1][1]);
		System.out.println(arr[1][0][0]);
		System.out.println(arr[1][0][1]);
		System.out.println(arr[1][1][0]);
		System.out.println(arr[1][1][1]);
		

		
		
		
		
		
		
		
		
		
	}

}
