package array;

import java.util.Arrays;

public class Remove_Duplicate {
	

	
	public static void main(String[] args) {
		
		
		
		int [] a= {10,20,10,20,60,30,40,50,40,50,70};
		
		
		int count=0;
		int sum=0;
		
		
		for (int i = 0; i < a.length; i++) {
			
			int d=1;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
					a[j]=0;
					
					d++;
					
					
				
				}
				
			}
			
			
			
		}
		
		
		for(int y:a) {
			
			if(y>0) {
				
				count++;
				
			}
			
			
		}
		
		int []b=new int[count];
		int index=0;
		
		for (int j = 0; j < a.length; j++) {
			
			if(a[j]>0) {
				
				b[index]=a[j];
				index++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
