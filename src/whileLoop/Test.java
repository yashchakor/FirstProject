package whileLoop;

import java.util.Scanner;

public class Test {
	
	
	
	
	public static void main(String[] args) {
		
		
//		//print hello 5 times
//		
//		
//		int start=1;
//		int end=5;
//		
//		while(start<=end) {
//			
//			System.out.println("hello");
//			
//			start++;
//			
//		}
		
		
		//print 1 to 10 numbers
		
		
//		int start=1;
//		int end=10;
//		
//		while(start<=end) {
//			System.out.println(start);
//			
//			start++;
//		}
		
		
		//print reverse number
		
		
		
//		int num=354;
//		
//	int	reverse=0;
//		
//		
//		while(num>0) {
//			
//			int last=num%10;
//			
//			reverse=(reverse*10)+last;
//			
//			num=num/10;
//			
//			
//		}
//		System.out.println(reverse);
		
		
		//print sum of digits of 356
//		int num=356;
//		int start=1;
//		int end=3;
//		
//		
//		while(start>0) {
//			
//			int f=num%10;
//			int latestnum=num/10;
//			
//			int s=latestnum%10;
//			
//			int r=latestnum/10;
//			
//			System.out.println(f+s+r);
//			start--;
		
		
	//	}
			
			
		//how to reverse the float number

	float num = 123.45f;

	String str = String.valueOf(num);
	String reverse = "";

	int i = str.length() - 1;

	do {
	    reverse = reverse + str.charAt(i);
	    i--;
	} while (i >= 0);

	System.out.println(reverse);
		
		
		
		
		
		
		
	}
	
	
	
	

}
