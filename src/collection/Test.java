package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Collection <Integer> c=new ArrayList();
		
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		
		// enhance for lloop
		
		
		for(Integer y:c) {
			
			System.out.println(c);
			
			
		}
		
		
		c.forEach(System.out::println);
		
		
		System.out.println(" print using iterator");
		
		Iterator<Integer> itr = c.iterator();
		
		while(itr.hasNext()) {
			Integer x=itr.next();
			System.out.println(x);
			
			
		}
		
		
	}

}
