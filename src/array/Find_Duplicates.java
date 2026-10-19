package array;

public class Find_Duplicates {
	

	public static void main(String[] args) {
	
		int[] a = {10, 20, 10, 30, 20, 10, 40, 30};
		
		boolean [] duplicate =new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
			
			
			int count=1;
			
			
			if(duplicate[i]) {
				
				continue;
			}
			
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
				duplicate[j]=true;
				count++;
				
				}
				
				
			}
			
			if(count>1) {
				System.out.println(a[i]+" is duplicate"+" count is = "+count);
			}
			
			
		}
		
	
	}

}
