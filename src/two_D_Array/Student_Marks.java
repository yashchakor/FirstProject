package two_D_Array;

public class Student_Marks {
	
	
	public static void main(String[] args) {
		
	
		
		int[][]arr= {
				
				
				{45,60,55},
				{50,65,40},
				{35,65,78},
				
	
				
		};
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Student "+(i+1)+" marks");
			
			for (int j = 0; j < arr[i].length; j++) {
				
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
