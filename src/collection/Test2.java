package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		
		Collection< Student> s=new ArrayList<Student>();
		
		s.add(new Student(101,"yash"));
		s.add(new Student(102,"Abhi"));
		s.add(new Student(103,"Priya"));
		s.add(new Student(104,"Sahiba"));
		s.add(new Student(105,"Divya"));
		
		
		for(Student y:s) {
			System.out.println(y);
			
			
		}
		
		
		s.forEach(System.out::println);
		
		
		Iterator<Student> itr = s.iterator();
		
		while(itr.hasNext()) {
			
			Student r=itr.next();
			
			System.out.println(r);
			
			
		}
		
	}

}
