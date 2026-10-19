package mockInterview;

public class Date_29 {
	
	
	
	
	public static void main(String[] args) {
		
		int original=1453;
		int num=original;
		
		int count=0;
		int sum=0;
		
		
		while(num>0) {
			
			num=num/10;
			
			count++;
		}	
		
		
		num=original;
		
		
		while(num>0) {
			
			int next=num%10;
			
			 int r =( int)Math.pow(next, count);
			 
			 sum=sum+r;
			
			 num=num/10;
			
		}
		
		if(original==sum)
			System.out.println(" This is Armstrong number");
		
		
		else
			System.out.println(" Not Armstrong Number");
		
		
	}
	

}
