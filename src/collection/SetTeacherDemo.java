package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTeacherDemo {
	
	
	public static void main(String[] args) {
		
		Set<Teacher> s=new HashSet();
		
		s.add(new Teacher(101,"Yash"));
		s.add(new Teacher(102,"Priya"));
		s.add(new Teacher(103,"Sahiba"));
		
		System.out.println(" print using for each method");
		s.forEach(y->{
			
			System.out.println(y.getId()+" "+y.getName());
			
		});
		
		System.out.println("enhance for loop");
		
		for (Teacher t : s) {
			
			System.out.println(t.getId()+" "+t.getName());
			
		}
		
		System.out.println("print using iterator");
		
		Iterator<Teacher> itr = s.iterator();
		while(itr.hasNext()) {
			
			Teacher t=itr.next();
			System.out.println(t.getId()+" "+t.getName());
			
		}
		
	}

}
