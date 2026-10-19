package pattern;

import java.util.Iterator;

public class Practice {
	
	
	public static void main(String[] args) {
		
		int row=4;
		int n=1;
		
		for (int i = row; i >=1; i--) {
			
			for(int j=1;j<=row-i;j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
