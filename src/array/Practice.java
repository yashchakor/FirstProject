package array;

import java.util.Arrays;

public class Practice {
	
	
	
	
	public static void main(String[] args) {
		
//		Print all elements of an array.
//
//		int[] a = {10,20,30,40,50};
//		Find the sum of all elements in an array.
//		Find the average of array elements.
//		Find the maximum element in an array.
//		Find the minimum element in an array.
//		Count even and odd numbers in an array.
//		Count positive, negative and zero elements.
//		Print elements at even indexes and odd indexes.
		
		
		//Print all elements of an array.
		
		
		
//		int[] a = {10,20,30,40,50};
//		
//		for(int y:a) {
//			
//			System.out.println(y);
//		}
//	
		
		
		
	//	Find the sum of all elements in an array.
		
//		int[] a = {10,20,30,40,50};
//		
//		int sum=0;
//		
//		for( int y:a) {
//			
//			sum=sum+y;
//			
//		}
//		
//		System.out.println(sum);
//		
//		
		
		//Find the average of array elements.
		
		
//		int[] a = {10,20,30,40,50};
//		int count=0;
//		int sum=0;
//		
//		for( int y:a) {
//			
//			sum=sum+y;
//			
//			count++;
//			
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum/count);
//		
//		
		//Find the maximum element in an array.
		
		
//		int[] a = {10,20,30,40,50};
//		
//		int max=a[0];
//		
//		for(int y:a) {
//			
//			if(y>max) {
//				
//				max=y;
//			}
//			
//			
//			
//			
//		}
//		
//		System.out.println(max);
		
		
		//Find the minimum element in an array.
		
//		int[] a = {10,20,30,2,40,50};
//		
//		int min=a[0];
//		
//		for(int y:a) {
//			
//			if(y<min) {
//				
//				min=y;
//			}
//			
//			
//			
//			
//		}
//		
//		System.out.println(min);
//		
//	
		
		
		//Count even and odd numbers in an array
//		
//		int[] a = {10,20,30,40,50,7,5};
//		
//		int evenCount=0;
//		int oddCount=0;
//		for(int y:a) {
//			
//			if(y%2==0) {
//				evenCount++;
//				
//			}
//			
//			else {
//				
//				oddCount++;
//			}
//			
//			
//		}
//		
//		System.out.println(evenCount);
//		System.out.println(oddCount);
//		
//		
//		
		
		
		
		
		//Count positive, negative and zero elements.
		
		
		
		
//		
//		int[] a = {10,0,-30,40,-50,0,5};
//		
//		int positiveElement=0;
//		
//		int negativeElement=0;
//		
//		int zeroElement=0;
//		
//		
//		for(int y:a) {
//			
//			
//			if(y<0) {
//				
//				negativeElement++;
//				
//				
//			}
//			
//			else if(y>0) {
//				
//				
//				positiveElement++;
//			}
//			
//			
//			else {
//				
//				zeroElement++;
//				
//			}
//			
//			
//		}
//		
//		System.out.println(negativeElement);
//		System.out.println(positiveElement);
//		System.out.println(zeroElement);
//		
		
		
		//Print elements at even indexes and odd indexes.
		
//		int[] a = {10,20,30,40,50};
//		for(int i=0;i<a.length;i++) {
//			
//			if(i%2==0) {
//				
//				System.out.println("elem at even index = "+a[i]);
//				
//			}
//			
//			else {
//			
//			System.out.println("elem at odd index = " +a[i]);
//			}
//			
//		}
//		
		
		//Search a given element in an array and print its index.
		
		
		//given element=6
		
		
		
//		int[] a = {10,20,30,6,50};
//		
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]==6) {
//				
//				System.out.println(i);
//				
//			}
//			
//		}
		
		
		
		
		
		
		//Reverse an array without using another array.
		
//		
		int[] a = {10,20,30,6,50};
		
		
		int[]s=new int[a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			
			s[index]=a[i];
			index++;
			
		}
			
		System.out.println(Arrays.toString(s));
		
		
		
		
		
		// Find duplicate elements in an array.
		
		
		
//		
//		int[] a = {10,50,20,10,30,6,30,50};
//		
//		
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			
//			for(int j=i+1;j<a.length;j++) {
//				
//				if(a[i]==a[j]) {
//					
//					System.out.println(a[i]+" is duplicate");
//					
//					
//					
//				}
//				
//								
//			}
//			
//			
//			
//		}
//		
		
		
	//	Find unique elements in an array
//		
				
		
		
//		
//		char[]c= {'1','$','5','A','u',};
//		
//		
//		for(char y:c) {
//			
//			if(Character.isAlphabetic(y)||Character.isDigit(y)||Character.isLetter(y)||Character.isWhitespace(y)) {
//				
//				
//			}
//			
//			else {
//				
//				System.out.println(y);
//			}
//			
//			
//		}
			
		//Find the frequency of each element in an array	
			
			
			
			
		
	
		
	}
	
	

}
