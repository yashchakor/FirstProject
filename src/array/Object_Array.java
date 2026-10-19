package array;

import java.util.Arrays;

public class Object_Array {
	
	
	
	public static void main(String[] args) {
		
		// if we create Object [] then we can store hetrogeneous data in array  
		
		Owner a1=new Owner(101,"yash");
		Owner a2=new Owner(102,"prateek");
		Owner a3=new Owner(103,"mahesh");
		
		Car c1=new Car(7777,"fortuner");
		Car c2=new Car(6699,"thar");
		Car c3=new Car(4545,"harrier");
		
		
		Object []s= {a1,a2,a3,c1,c2,c3};
		
		for(Object y:s) {
			
			if (  y instanceof Owner) {
				
				System.out.println( y);
				
			}
			
			
		}
		
		
		
	}

}
