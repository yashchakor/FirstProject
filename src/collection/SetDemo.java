package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		// set not allowed duplicate
		Set<Integer> s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);

		s.forEach(System.out::println);
		
		System.out.println("print using iterator");
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
			
		}
		
		System.out.println(" enhance for loop");
		
		for (Integer integer : s) {
			
			System.out.println(integer);
			
		}
		

	}

}
