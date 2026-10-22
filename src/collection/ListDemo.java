package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		// list allowed duplicate

		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);

		l.add(1, 60);
		System.out.println(l.get(2));

		System.out.println(l.size());

		System.out.println(" print using for each method");

		l.forEach(System.out::println);

		System.out.println(" print using enhance for loop");

		for (Integer y : l) {
			System.out.println(y);

		}

		System.out.println(" print using itererator");

		Iterator<Integer> itr = l.iterator();

		while (itr.hasNext()) {

			Integer s = itr.next();

			System.out.println(s);

		}

		System.out.println(" print using Listitererator");
// forward traversal

		ListIterator<Integer> litr = l.listIterator();

		while (litr.hasNext()) {

			Integer s = litr.next();

			System.out.println(s);

		}

		System.out.println(" print using for loop");

		for (int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));

		}

	}

}
