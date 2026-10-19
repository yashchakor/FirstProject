package two_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Scanner {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows");
	
		int rows=sc.nextInt();
		System.out.println("enter colums");
		int colm=sc.nextInt();
		int [][]arr=new int[rows][colm];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println("Enter number");
				int num=sc.nextInt();
				
				arr[i][j]=num;
				
			}
			
		}
		
		
		
		for(int []arr2:arr) {
			
			System.out.println(Arrays.toString(arr2));
		}
		
//		[1, 2, 3]
//		[4, 5, 6]
//		[7, 8, 9]

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
