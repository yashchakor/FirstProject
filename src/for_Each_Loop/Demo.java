package for_Each_Loop;

import java.util.Arrays;

public class Demo {
	
	
	
	
	public static void main(String[] args) {
		
		//for loop is used with array and collection
		
	// int array	
//		int [] a= {1,2,3,4,6};
//	
//		for(int b:a) {
//			
//			System.out.println(b);
//			
//		}
		
	//string array	
		
//		String []s={"Yash","ramesh","Chakor"};
//		
//		for(String x:s) {
//			
//			
//			System.out.println(x);
//		}
//		
//	float array	
//		
//		float []f= { 12.0f,53.0f,65.12f};
//		
//		for(float x:f) {
//			
//			
//			System.out.println(x);
//		}
		
		//print only even numbers
		
//		
//		int []b= {1,2,3,4,5,6,7,8,9,10};
//		
//		for(int x:b) {
//			
//			if(x%2==0) {
//				
//				System.out.println(x);
//				
//				
//			}
//			
//		}
//		
//		
		
		//print sum
//		
//		
//		int sum=0;
//		int []i= {1,2,3,4,5};
//		
//		
//		for(int y:i) {
//			
//			sum=sum+y;
//			
//		}
//		
//		System.out.println(sum);
//		
//	split method is used to remove space between words
		
//	 String s="my name is yash";
//	 String[] x = s.split(" ");
//	 
//	 for(String y:x) {
//		 
//		 System.out.println(y);
//		 
//	 }
//	 
	// print numbers addition from String	
		
//	 String s="a1m2a3n9yash5";
//	 String sum="";
//	 
//	 
//	 for(int i=0;i<s.length();i++) {
//		 
//		char c= s.charAt(i);
//		
//		
//		if(Character.isDigit(c)) {
//			
//			sum=sum+c;
//			
//			
//		}
//		 
//		 
//	 }
//	 
//	 int x = Integer.parseInt(sum);
//	
//	 
//	 int add=0; 
//	 for(;x>0;x=x/10) {
//		 
//		 int next=x%10;
//		 
//		 add=add+next;
//		
//		 
//	 }
//	 
//	 System.out.println(add);
		
		
		
		
		
//print numbers addition from String
		
//		String s="a1m2a3n";
//		int sum=0;
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			
//			if(Character.isDigit(c)) {
//				
//				int x=Character.getNumericValue(c);
//				sum=sum+x;
//				
//			}
//			
//		}
//		
//		System.out.println(sum);
		
		
		
		// check array is equal
		
////		
//		int []a= {1,2,3};
//		int[]b= {1,2,3};
//		  
//		System.out.println(Arrays.equals(a, b));
		
	//sort array
		
//		
//		
//		int []a= {3,8,2};
//		
//		
//		
//		
//		 Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
//		
		
		
		
		
//		
//		
//		
		
		
		//extra technique by self
		
//		int []a= {3,8,2};
//		
//		int sum=0;
//		
//		
//		Arrays.sort(a);
//		
//		System.out.println(Arrays.toString(a));
//		
//		String x = Arrays.toString(a);
//		System.out.println(x);
//		String[] y = x.split(","+" ");
//		for(String s:y) {
//			s=s.replace("[", "");
//			s=s.replace("]", "");
//		int i=Integer.parseInt(s);
//		System.out.println(i);
//		
//		
//		
//		for(;i>0;i=i/10) {
//			
//			int next=i%10;
//			sum=sum+i;
//			
//			
//			
//		}
//		
//		
//		}
//
//		System.out.println(sum);
//		
//		
		
		
// check String is anagram or not
		
//		String s1="listen";
//		String s2="silent";
//		
//		
//		if(s1.length()==s2.length()) {
//			
//			
//			char[] arr1 = s1.toCharArray();
//			char[] arr2 = s2.toCharArray();
//			
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
//			
//			if(Arrays.equals(arr1, arr2)){
//				
//				System.out.println("String is Anagram");
//			}
//			
//			else {
//				
//				System.out.println("not Anagram ");
//			}
//		}
//	
//		else {
//			
//			System.out.println(" not Anagram");
//		}
//		
////		
//		
		// task = input=aman12Sharma34
		//        op=  amanSharma1234			
		
		
		
//		String s="aman12sharma34";
//		
//		String digit="";
//		String letter="";
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			
//			if (Character.isDigit(c)) {
//				
//				digit=digit+c;
//				
//				
//			}
//			
//			else
//				letter=letter+c;
//			
//			
//		}
//		
//		System.out.println(letter+digit);
//		
//		

	}

}
