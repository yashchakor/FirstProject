package array;

import java.util.Arrays;

public class copy_Array {
	
	
	
	public static void main(String[] args) {
		
		//copy one array into another array
		
		
		int[]a= {1,2,6,4,5};
		
		int[]b=new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			b[i]=a[i];
			
		}
		
	
		System.out.println(Arrays.toString(b));
		
		
	}
	
	
	
	


}
