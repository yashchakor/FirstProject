package array;

public class Freq_Of_Each_Element {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int[]arr= {10,20,30,20,10,10};
		int max=0;
		int y=0;
		
		int min=0;
		int x=0;
		
		boolean[] visited=new boolean[arr.length];
		
		for (int i = 0; i < visited.length; i++) {
			
			
			if(visited[i]) {
				
				continue;
			}
			
			int count=1;
			for (int j = i+1; j < visited.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					visited[j]=true;
					count++;
					
				}
				
				
			}
			
			System.out.println(arr[i]+" ="+count);
			
			if(count>max) {
				
				max=count;
				 y=arr[i];
				
			}
			
			else {
				
				min=count;
				x=arr[i];
			}
			
			
		}
		
	
		System.out.println("maximum element "+y+"= "+" count is ="+max);
		System.out.println("min element "+x+" = "+" count is ="+min);
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
