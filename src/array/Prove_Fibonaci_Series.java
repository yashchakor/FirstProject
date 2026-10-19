package array;

import java.util.Arrays;
import java.util.Iterator;

public class Prove_Fibonaci_Series {
	
	
	public static void main(String[] args) {
		
		
		int[]x= {0,1,1,2,3,5,8,13,21,34};//check it is a fibonaci series or not
		
		
		int firstNum=0;
		int secondNum=1;
		String s="";
		int index=0;
		
		int[]b=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			
			System.out.println(firstNum);
			
			
			
			b[i]=firstNum;
			
		
			int next=firstNum+secondNum;
			
			firstNum=secondNum;
			secondNum=next;
			
			if(i==x.length-1) {
				
				if(Arrays.equals(b, x)) {
					System.out.println("fibonaci series");
					
				}
				
				else {
					
					System.out.println("not ");
				System.out.println(Arrays.toString(x));
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
