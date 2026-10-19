package array;

public class Prime_Number {
	
	
	
	public static void main(String[] args) {
		
		
		
		int []x= {1,2,3,4,5,6,7,8,9};
		int count=0;
		int prime=0;
		
		for (int i = 0; i < x.length; i++) {
			
			count=0;
			for (int j = 1; j <=x[i]; j++) {
				
				if(x[i]%j==0) {
					
					count++;
					
					
				}
				
			}
			
			if(count==2) {
				
				System.out.println(x[i]+" = is prime");
				
				prime++;
			}
		}
		
		System.out.println("Total Prime Num = "+prime);
		
	}
	

}
