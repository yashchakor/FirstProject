package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
	
	public static void main(String[] args) {
		
		Collection<String> s=new ArrayList<String>();
		
		s.add("yash");
		s.add("Ramesh");
		s.add("Chakor");
		s.add("Sahiba");
		s.add("Pooja");
		
		for(String y:s) {
			System.out.println(y);
			
		}
		
		
		s.forEach(System.out::println);
		
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			
			String y=itr.next();
			
			System.out.println(y);
			
		}
		
		
	}

}
