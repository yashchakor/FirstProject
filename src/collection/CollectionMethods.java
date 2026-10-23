package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {
	
	
	public static void main(String[] args) {
		
		
		Collection c=new ArrayList();
		
		System.out.println(c.isEmpty());
		
		c.add("Yash");
		c.add('A');
		c.add(101);
		System.out.println(c);
		
		//addAll
		Collection list=new ArrayList();
		
		list.add(102);
		list.add("Priya");
		list.add('S');
		list.add(null);
		
		c.addAll(list);
		
		System.out.println(c);
		
		//c.clear();
		
		//System.out.println(c);
		
		System.out.println(c.contains("Yash"));
		c.remove("Yash");
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		
	Iterator itr = c.iterator();
	while(itr.hasNext()) {
		
		Object s = itr.next();
		
		System.out.println(s);
		
		
		
	}
		
	}

}
