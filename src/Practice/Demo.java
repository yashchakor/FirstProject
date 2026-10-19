package Practice;

import java.util.Arrays;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		String s="java is old language java my class fullstack javaprogram";
		int count=0;
		String sum="";
		
		int maxString=0;
		
			char[] f = s.toCharArray();
			
			for(char y:f) {
				
				if(Character.isWhitespace(y)) {
					
					System.out.println(sum+"= "+count);
					
					System.out.println();
					
					if(count>maxString) {
						
						maxString=count;
					}
					count=0;
					sum="";
					
					
				}
				

				else {
					
					sum+=y;
					count++;
				}
				
			}
		
		System.out.println(" maximum String is = "+maxString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
