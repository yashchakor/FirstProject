package mockInterview;

public class Practice {
	
	
	
	public static void main(String[] args) {
		
		int row=5;
		int n=1;
		
		for(int i=0;i<row;i++) {
			
			
			
			for(int j=0;j<=3-i;j++) {
				
				System.out.print(" ");
			
				
			}
			
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(n+" ");
				n++;
			}
			
			System.out.println();
			
		}
		
		
        for(int i=row-1;i>0;i--) {
        	
        	
        	for(int j=1;j<=row-i;j++) {
        		
        		
        		System.out.print(" ");
        	}
        		for(int j=1;j<=i;j++) {
        			
        			System.out.print(n+" ");
        			n++;
        			
        		}
        		System.out.println();
        		
        	}
			
//			
		}
//		
//       
		
			
		}
		
	
	


