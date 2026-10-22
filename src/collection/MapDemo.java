package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> m=new HashMap();
		
		m.put(1, "Yash");
		m.put(2, "Ramesh");
		m.put(3, "Chakor");
		
		
		Set<Integer> keys = m.keySet();
		
		for(Integer key:keys) {
			String value=m.get(key);
			
			System.out.println(key+" "+value);
			
			
		}
		
		
		
		
	}

}
