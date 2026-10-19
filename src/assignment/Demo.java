package assignment;

import java.util.Arrays;
import java.util.Collections;


public class Demo {
	
	
	public static void main(String[] args) {
		
//		
//		Assignment:
//			​Find the sum of elements at prime indexes.
		
//			Find the largest difference between any two elements.
//
//			Move all zeroes to the end of the array.
//			​
//			Move all negative numbers to the beginning.
//			​
//			Find the first repeating element.
//			​
//			Find the first non-repeating element.
//			​
//			Find the missing number from 1 to N.
//			​
//			Find the element that appears only once when all others appear twice.
//			​
//			Check whether an array is sorted in ascending order.
//			​
//			Check whether an array is a palindrome.
//			​
//			Find the sum of first half and second half separately.
//			​
//			Find the middle element(s) of an array.
//			​
//			Replace every element with the sum of its previous and next element.
//			​
//			Find the longest sequence of consecutive numbers.
//			​
//			Find the maximum consecutive even numbers.
//			​
//			Find the maximum consecutive odd numbers.
//			​
//			Rotate an array one position to the left.
//			​
//			Rotate an array one position to the right.
//			​
//			Find two elements whose sum is equal to a given number.
//			​
//			Find the element closest to a given number.
//		
		
		
		
		//​Find the sum of elements at prime indexes.
		
		
		
//		int [] x= {1,2,3,4,6,5,8,9};
//		
//		int count=0;
//		int sum=0;
//		for (int i = 0; i < x.length; i++) {
//			
//			count=0;
//			
//			for(int j=1;j<=i;j++) {
//				
//				if(i%j==0) {
//					
//					count++;
//					
//				}
//				
//	
//			}
//			
//			if(count==2) {
//				
//				sum=sum+x[i];
//				
//			}
//			
//		}
//		
//		
//		System.out.println(sum);
//		
//		
		
		
	//	Move all zeroes to the end of the array.	
		
//		int[] a = {1, 0, 3, 0, 5,0,6,0,7,0,8};
//
//		int s = 0;
//
//		for (int i = 0; i < a.length; i++) {
//		    if (a[i] != 0) {
//		        a[s] = a[i];
//		        s++;//1
//		    }
//		}
//
//		while (s < a.length) {
//		    a[s] = 0;
//		    s++;
//		}
//
//		System.out.println(Arrays.toString(a));
		
		
		
	//	Move all negative numbers to the beginning.
		
		
//		int[] a = {5, -2, 3, -1, 4,-6,-8};
//
//		int s = 0;
//
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			if(a[i]<0) {
//				
//				 int temp=a[s];
//				a[s]=a[i];
//				
//				a[i]=temp;
//				
//				s++;
//				
//			}
//			
//			
//		}
//		System.out.println(Arrays.toString(a));
//
//		
		
		
	//	Check whether an array is a palindrome.
		
		
//		int []x= {1,2,1};//1
//		
//		int[]y=new int[x.length];
//		
//		int index=0;
//		
//		for (int i = x.length-1; i >=0; i--) {
//			
//			y[index]=x[i];
//			index++;
//			
//		}
//		
//		
//		if(Arrays.equals(x, y)) {
//			
//			
//			System.out.println("array is palendrome");
//		}
//		
//		
//		else {
//			
//			System.out.println("not palendrome");
//		}
//		
//		
//		
		
//Check whether an array is sorted in ascending order.		
//		int []x= {1,2,3,4,5,6};
//		
//	
//		int []y=new int[x.length];
//		int index=0;
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			
//			y[index]=x[i];
//			index++;
//			
//		}
//		
//		Arrays.sort(x);
//		
//		
//		if(Arrays.equals(y, x)) {
//			
//			
//			System.out.println("array is sorted in asending order");
//		}
//		
//		else {
//			
//			System.out.println("not");
//		}
//		
		
		
		
		// sort without method
		
		
		
		
		int []x= {5,4,2,1};
		
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j <x.length; j++) {
				
				if(x[i]>x[j]) {//
					
					int temp=x[j];
					
					x[j]=x[i];
					
					x[i]=temp;
					
					
				}
				
			}
			
		}
		
		
		System.out.println(Arrays.toString(x));
		
		
		
		
		
		
	}

	

}
