package array;

public class Print_Zero_Last {

	
	
	
	public static void main(String[] args) {
		
		
		
		int []x= {3,0,1,0,2,0,5,7};//output=31257000
		
		
		for(int y:x) {
			
			if(y>0) {
				
				System.out.print(y);
			}
			
		}
		
		for(int y:x) {
			
			if(y==0) {
				System.out.print(y);
				
				
			}
		}
		
	}
}
