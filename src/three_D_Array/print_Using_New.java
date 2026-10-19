package three_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class print_Using_New {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many 2 d array you want");
		int twoD=sc.nextInt();
		System.out.println("enter how many rows you want");
		int rows=sc.nextInt();
		System.out.println("enter how many column you want");
		int colm=sc.nextInt();
		int[][][] arr=new int[twoD][rows][colm];
		
		//int [][][] arr= { {{1,2}  ,{3,4}   },  {{5,6},{7,8}}  };

		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr[i].length; j++) {
				
				for (int k = 0; k < arr[i][j].length; k++) {
					
					System.out.println("enter number");
					
					int x=sc.nextInt();
					
					arr[i][j][k]=x;
					
					
					
				}
				
			}
			
			
			
		}
		
		
		
		
		
		for(int [][]arr1:arr) {
			
			for(int []arr2:arr1) {
				
				System.out.println(Arrays.toString(arr2));
			}
			
		}
		
		
		
	}

}
