package array;

public class Print_Armstrong {
	
	
	public static void main(String[] args) {
		
		
		int[]a={454,153,654,1634};
		
		
		
		
		int count=0;
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=0;
			count=0;
			
			int x=a[i];
			
			while(a[i]>0) {
				
				a[i]=a[i]/10;
				
				
				count++;
				
				
			}
			
		int	r=x;
			while(r>0) {
				
				int next=r%10;
				
				int y=(int)Math.pow(next, count);
				
				
				sum=sum+y;
				
				r=r/10;
				
			}
			
			
			if(sum==x) {
				
				System.out.println(x+"= is Armstrong");
				
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
