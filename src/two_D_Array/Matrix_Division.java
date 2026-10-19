package two_D_Array;

import java.util.Arrays;

public class Matrix_Division {
	
	
	public static void main(String[] args) {
		
		
		
	int [][] arr1= {
				
				{10,20},
				{30,40}
				
				
		};
			
		int [][] arr2= {
				
				{2,2},
				{6,2}
				
				
		};
		
		
		int [][]result= new int[arr1.length][arr1[0].length];
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1[i].length; j++) {
				
				result[i][j]=arr1[i][j]/arr2[i][j];
				
			}
			
		}
		
		
		for (int y[]:result) {
			System.out.println(Arrays.toString(y));
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
