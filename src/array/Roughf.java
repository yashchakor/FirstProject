package array;

import java.util.Arrays;

public class Roughf {
	
	
	
	//left shift array elements
	
	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,4};
		
		
		
		for (int k = 0; k < a.length-1; k++) {
			
		
		
		int s=a[0];
		
		
		for (int  i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j <a.length; ) {
				
				a[i]=a[j];
				break;
			}
		}
		
		
		a[a.length-1]=s;
		
		System.out.println(Arrays.toString(a));
		
	}
	}
}
