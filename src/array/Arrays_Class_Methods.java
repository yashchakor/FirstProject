package array;

import java.util.Arrays;

public class Arrays_Class_Methods {
	
	public static void main(String[] args) {
		
		
		//toString()
		
		int []x= {2,3,6,5};
		
		System.out.println(Arrays.toString(x));
		
		
		System.out.println("------------------------");
		
		
		// equals()
		
		int []a= {1,2,3};
		int []b= {1,2,3};
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println("------------------------");
		
		
		//sort
		
		int []s= {10,5,40,30};
		
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
		System.out.println("------------------------");

		
		//binarySearch
		
		
		System.out.println(Arrays.binarySearch(s, 40));// because sorted array is [5, 10, 30, 40] so 40 is in index 3
		
		System.out.println("------------------------");

		//fill()
		
		
		int [] r=new int[5];
		Arrays.fill(r, 7);
		System.out.println(Arrays.toString(r));
		
		System.out.println("------------------------");
	
		//copyOf()
		
		int []p= {10,5,40,30};
		
		
		int []f=Arrays.copyOf(p, 5);
		
		System.out.println(Arrays.toString(f));

		
		
		
		
		
		
		
		
		
	}
	
	

}
