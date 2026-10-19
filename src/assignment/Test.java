package assignment;

import java.util.Arrays;
import java.util.Iterator;

public class Test {
	
	
	public static void main(String[] args) {
		

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
		
		
	//	​Find the sum of elements at prime indexes.
		
		
//		int []x= {1,2,3,4,5,6,7,8,9};
//		
//		int count=0;
//		int sum=0;
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			
//			for (int j = 1; j <=i; j++) {
//				
//				
//				if(i%j==0) {
//					
//					count++;
//					
//					
//				}
//				
//			}
//			
//			if(count==2) {
//				
//				sum+=x[i];
//			}
//			
//			count=0;
//			
//		}
//		
//		System.out.println(sum);
//		
		
	//	Move all zeroes to the end of the array.
		
//		int []x= {1,0,3,0,5,};
//		
//		int index=0;
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			if(x[i]!=0) {
//				
//				x[index]=x[i];
//				index++;
//				
//			}
//		
//			
//		}
//		
//		for (int j = index; j < x.length; j++) {
//			
//			x[j]=0;
//			
//			
//		}
//		
//		
//		
//		System.out.println(Arrays.toString(x));
//		
//		
		
		
		//Move all negative numbers to the beginning.
		
		
//		int []x= {1,-2,3,-4};
//		int index=0;
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			
//			
//				
//				
//				if(x[i]<0) {
//					
//					int temp=x[index];
//					
//					x[index]=x[i];
//					
//					x[i]=temp;
//					
//					index++;
//					
//					
//				}
//				
//			}
//			
//		System.out.println(Arrays.toString(x));
//		
//		
//		
		
//		Find the largest difference between any two elements.

//		int []x= {1,2,3,4,5,6,7,8,9};
//		
//		int max=0;
//		int ivalue =0;
//		int jvalue =0;
//
//		for (int i = 0; i < x.length; i++) {
//			
//			for (int j = 0; j < x.length; j++) {
//				
//				
//				int temp=x[i]-x[j];
//				
//				if(temp>max) {
//					ivalue=0;
//					jvalue=0;
//					max=temp;
//					
//					ivalue=x[i];
//					jvalue=x[j];
//					
//				}
//				
//			}
//			
//		}
//		
//		System.out.println(ivalue+"-"+jvalue+" = "+max);
//		
	
	//	Find the first repeating element.
		
		
		
//		
//		int []x= {1,2,3,4,5,6,3};
//		
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			for(int j=i+1;j<x.length;j++) {
//				
//				
//				if(x[i]==x[j]) {
//					
//					System.out.println(x[i]);
//					return;
//				}
//				
//				
//			}
//			
//		}
//		
		
		//Find the first non-repeating element.
		
		
		
		
//		int []x= {1,2,3,4,5,3,1,2,6};
////		
//		int count=0;
//		for (int i = 0; i < x.length; i++) {
//			 count=0;
//			for(int j=0;j<x.length;j++) {
//				
//				
//				if(x[i]==x[j]) {
//					
//					count++;
//				}
//				
//				
//			}
//			
//			
//			if(count==1) {
//				
//				
//				System.out.println(x[i]);
//				return;
//			}
//			
//		}
//		
//		
	//	Find the missing number from 1 to N.
		
		
//		int []x= {1,2,3,4,6,7,8,9,10};
//		
//		
//		int y=1;
//		for (int i = 0; i < x.length; i++) {
//			y=1;
//			for (int j = i+1; j < x.length; j++) {
//				
//				
//				if((x[j]-x[i])>1) {
//					
//					int num=x[j]-x[i];
//					while(num>1) {
//						
//						
//						int s=x[i]+y;
//						
//						System.out.println(s);
//						
//						y++;
//						num--;
//						
//						
//					}
//					
//					
//					
//				}
//				
//		
//				break;
//				
//			}
//			
//		}
//		
		
	//	Find the element that appears only once when all others appear twice.
		
//		int []x= {1,1,2,3,3,4};
//		int count=0;
//		for (int i = 0; i < x.length; i++) {
//			
//			count=0;
//			
//			
//			for (int j = 0; j < x.length; j++) {
//				
//				
//				if(x[i]==x[j]) {
//					
//					count++;
//				}
//				
//			}
//			
//			
//			if(count==1) {
//				
//				
//				System.out.println(x[i]);
//			}
//			
//			count=0;
//			
//		}
//		
		
		//Find the sum of first half and second half separately.
		
		
//		int []x= {1,2,3,4};
//		
//		int sum=0;
//		int j=0;
//		
//		if(x.length%2==0) {
//		
//		for (int i = 0; i < (x.length/2); i++) {
//			
//			sum+=x[i];
//			j++;
//			
//		}
//		
//		System.out.println(sum);
//		sum=0;
//		
//		for ( ; j < x.length; j++) {
//			
//			sum+=x[j];
//			
//		}
//		
//		System.out.println(sum);
//	  }
//		
//		else System.err.println("not applicable");
		
		
		
		
		//Find the middle element(s) of an array.
//		
//		int []x= {1,2,3,4,5};
//		
//		
//		int i=x.length/2;
//		
//		if(x.length%2!=0) {
//		
//		System.out.println(x[i]);
//		
//		
//		}
//		
//		
//		else System.out.println("not applicable");
//		
//		
//		
//		
		
		
//		Replace every element with the sum of its previous and next element. take new updated value for next iteration
		
		
//		int []x= {1,2,3,4};
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			
//			if(i==0) {
//				
//				
//				
//				int next=i+1;
//				
//				
//				x[i]=x[next];
//			}
//			
//			
//			else if(i==x.length-1) {
//				
//				
//				int previous=i-1;
//				
//				
//				x[i]=x[previous];
//				
//			}
//			
//			else {
//				
//				
//            int previous=i-1;
//				
//				int next=i+1;
//				
//				int sum=x[previous]+x[next];
//				
//				x[i]=sum;
//			}
//			
//			
//			
//		}
//		
//		
//		System.out.println(Arrays.toString(x));
//		
//		
//		
		
		
		//Find the element closest to a given number.
		
		
//		int []x={10,20,30,40};
//		
//		int num=34;
//		for (int i = 0; i < x.length; i++) {
//			
//			for (int j = i+1; j < x.length; j++) {
//				
//				if(num>x[i]&&num<x[j]) {
//					
//					int s=num-x[i];
//					
//					int y=x[j]-num;
//					
//					
//					if(y>s) {
//						
//						System.out.println(x[i]);
//						
//					}
//					
//					else if(y==s) {
//						
//						System.out.println(x[i]);
//						System.out.println(x[j]);
//					}
//					
//					
//					else {
//						System.out.println(x[j]);
//					}
//				}
//				
//				break;
//			}
//			
//		}
		
		
	//	Find two elements whose sum is equal to a given number.	
		
		
		
//		int []x= {1,2,3,4,5,6,7,8,9,10};
//		
//		
//		int num=15;
//		
//		
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			
//			for (int j = i+1; j < x.length; j++) {
//				
//				
//				int sum=x[i]+x[j];
//				
//				if(sum==num) {
//					
//					System.out.println(x[i]+"+"+x[j]+" = "+(x[i]+x[j]));
//					
//				}
//				
//			}
//			
//		}
		
		
		
		
	//	Rotate an array one position to the left.
		
		
//		int []x= {1,2,3,4};
//		
//		int first=x[0];
//		
//		
//		
//		int index=0;
//		for (int i = 1; i < x.length; i++) {
//			
//			x[index]=x[i];//2,3,4
//			
//			index++;
//		}
//		
//		
//		
//		x[index]=first;
//		
//		
//		System.out.println(Arrays.toString(x));
//		
		
		
		//Find the maximum consecutive even numbers.
		
		
//		int []x={2,4,6,5,8,10,3,6,2,8,10};
//		
//		int count =0;
//		String s="";
//		int maxcount=0;
//		int supermaxcount=0;
//		
//		for (int i = 0; i < x.length; i++) {
//			
//			if(x[i]%2==0) {
//				
//				count++;
//				
//				 s+=x[i];
//				 
//				 if(count>maxcount) {
//					 
//					 maxcount=count;
//				 }
//			}
//			
//			else {
//				count=0;
//				
//				int y=Integer.parseInt(s);
//				
//				System.out.println(y+" = "+maxcount);
//				if(supermaxcount<maxcount) {
//					
//					supermaxcount=maxcount;
//				}
//				maxcount=0;
//				s="";
//				}
//			
//			
//			if(i==x.length-1&&x[x.length-1]%2==0) {
//				
//				System.out.println(s+" = "+maxcount);
//				if(supermaxcount<maxcount) {
//					
//					supermaxcount=maxcount;
//				}
//			}
//				
//			}
//			
//	
//		
//		System.out.println(supermaxcount);
//		
		//Find the longest sequence of consecutive numbers.
		
		
		int []x= {1,2,3,5,7,8,4,5,6,7};
		
		int count =1;
		int maxCount=0;
		
		for (int i = 0; i < x.length; i++) {
			
			
				
				if(i==x.length-1) {
					
					if(count>1) {
						System.out.println(count);
						if(count>maxCount) {
							maxCount=count;
						
						
						}
						
					}
					
					else {
						if(count>maxCount) {
							maxCount=count;
						
						
						}
					}
				
			}
			
		for (int j = i+1; j < x.length; j++) {
				
				int s=x[j]-x[i];
				
				if(s==1) {
					
					count ++;
					
					
				}
				
				else {
					
					if(count>maxCount) {
						
					maxCount=count;
						
						
					}
					
					else {
						
						if(count>1) {
					
					System.out.println(count);
					
					
						}
					
					count=1;
					}
					
					
				}
				
				break;
				
			}
			
		}
		
		
		System.out.println("longest sequence of consecutive numbers is = "+maxCount);
		
		
		
	}

}
