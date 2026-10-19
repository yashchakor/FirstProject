package array;

public class ArrayAsMethodParameter {
	

	public static void getArray(int [] a) {
		
		for(int y:a) {
			
			System.out.println(y);
			
		}

		
	}
	
	
	//we can pass multiple array
	
  public static void getArrays(int [] a,String []s) {
		
	
		for(int y:a) {
			
			System.out.println(y);
			
			
		}

  for(String y:s) {
		
		System.out.println(y);
		
		
	}
  }
	
	public static void main(String[] args) {
		
	//method one	
		int[]a= {1,2,4};
		
		 getArray(a);
		
System.out.println("--------------------------");
		 //	 method two
		
		getArray(new int [] {1,2,3,4,5});
		
System.out.println("-------------------------------------------");		
		// pass multiple array in method
		getArrays(new int [] {1,2,3,8}, new String[] {"yash","sagar"});
		
		
		
	}

}
