package two_D_Array;

import java.util.Arrays;

public class Jagged_Array {
	
	
	public static void main(String[] args) {
		
		
	int [][] arr=new int[2][];
		
		
		
		
		arr[0]=new int[2];
		
		arr[0][0]=1;
		arr[0][1]=2;
		
		
		arr[1]=new int[3];
		
		arr[1][0]=1;
		arr[1][1]=2;
		arr[1][2]=3;
		
		
		for(int arr2[]:arr){
			
			System.out.println(Arrays.toString(arr2));
			
		}
		
		
		
		
		
		
		
		
		
	}

}
