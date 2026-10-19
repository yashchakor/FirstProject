package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Sort_Array {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Integer []a= {1,2,8,6,9,7,4,5};
		
		
		//using Arrrays.sort()
		
//		Arrays.sort(a);
//	
//		System.out.println(Arrays.toString(a));
//		
		
		//Arrays.stream()
		
//		int []a2=Arrays.stream(a).sorted().toArray();
//		
//		System.out.println(Arrays.toString(a2));
//		
//		
//		List<Integer> list = Arrays.asList(a);
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
		//descending sorting
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		
	}

}
