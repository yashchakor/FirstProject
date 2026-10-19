package array;

public class Min_Max_Num_In_Array {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		int [] a= {2,6,8,1,5,7,9};
		
		
		
		//assume the first number is minimum
		int min=a[0];
		
		int max=a[0];
		
		
	for (int i = 0; i < a.length; i++) {
		
		if(min>a[i]){
		
		
		min=a[i];
		
		}
		
		else if(max<a[i]) {
			
			max=a[i];
			
		}
		
		
		
	}
		
		
		System.out.println(min);
		
		System.out.println(max);
		
		
		
		
	}

}
