package array;

import java.util.Arrays;
import java.util.Iterator;

public class Task {
	
	
	// print even numbers from array
	
	public static int[] getData(int[]a) {
		
		
		int count=0;
		
		for(int y:a) {
			
			
			if(y%2==0) {
				
				count++;
				
			}
			
			
			
		}
		int []b=new int[count];
		
		int index=0;
		for(int y:a) {
			
			if(y%2==0) {
			b[index]=y;
			index++;
		}
		}
		
		return b;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		int[] x = getData(new int [] {1,2,3,4,5,6,7,8,9,10});
		
		
		System.out.println(Arrays.toString(x));
		
		
	}
		
		
		
	}
	


