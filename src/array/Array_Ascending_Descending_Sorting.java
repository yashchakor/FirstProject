package array;

import java.util.Arrays;

public class Array_Ascending_Descending_Sorting {
	
	
	//sort array without using method
	
	
	
	public static void main(String[] args) {
		
		//ascending sorting
		
//		int []a= {3,2,5,1,8,7,6,4,10,9};
//		
//		
//		
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			
//			for (int j = i+1; j < a.length; j++) {
//				
//				if(a[i]>a[j]) {
//					
//					  int temp =a[i];
//					a[i]=a[j];
//					 a[j]=temp;
//				}
//				
//				
//				
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(a));
		
		
		//descending sorting
		
		
		int []a= {3,2,5,1,8,7,6,4,10,9};
		
	
		for (int i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
					
					  int temp =a[i];
					a[i]=a[j];
					 a[j]=temp;
				}
				
				
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
