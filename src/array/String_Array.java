package array;

public class String_Array {
	
	public static void main(String[] args) {
		
		
		
		String [] s= {"Yash","Mahesh","Prateek"};
		
		
		System.out.println("length is = "+s.length);
		
		System.out.println("-----------------------");
		
		System.out.println("print using index");
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		
		
		
		System.out.println("-----------------------");
		
		System.out.println("print using for loop");
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
		}
	
		System.out.println("-----------------------");

		System.out.println("print using for each loop");
		
		
		for(String y:s) {
			System.out.println(y);
			
		}
		
		System.out.println("-----------------------");

		System.out.println("print using Arrays : utility method");
		
		System.out.println();
		
		
	
		
		
		
		
	}

}
