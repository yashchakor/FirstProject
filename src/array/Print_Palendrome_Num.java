package array;

public class Print_Palendrome_Num {
	
	
	public static void main(String[] args) {
		
		
		int []x= {121,234,343,267};
		
		int rev=0;
		
	
		for (int i = 0; i < x.length; i++) {
			
			
			 rev=0;
			
			int s=x[i];
			
			while(x[i]>0) {
				
				
				int next=x[i]%10;
				
				
				rev=(rev*10)+next;
				
				
				x[i]=x[i]/10;
			
			
			}
			
			if(s==rev) {
				
				
				System.out.println(s+"= is palendrome");
				
			}
			
	
			
		}
		
		
		
		
	}
	
	
}
