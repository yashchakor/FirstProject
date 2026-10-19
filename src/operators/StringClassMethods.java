package operators;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringClassMethods {
	
	public static void main(String[] args) {
		//equals =used to check Strings are equal or not
		String s="aman";
		String s1="Aman";
		System.out.println(s.equals(s1));
		
		//equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase(s1));
		
		//compareTo:sorting-+ve,-ve,0
		
		String s2="deepak";
		String  s3="aman";
		
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s));
		
		// compareToIgnoreCase
		System.out.println(s3.compareToIgnoreCase(s1));
		//trim=remove white space before and after String
		String s4=" java ";
		
		System.out.println(s4.trim());
		//toUppercase=convert into uppercase
		String s5="aman";
		System.out.println(s5.toUpperCase());
		
		//toLowerCase=convert into lowercase
		String s6="Aman";
				
		System.out.println(s6.toLowerCase());
		
		//length=to find total number of characters in the String
		System.out.println(s6.length());
		
		//replace=replace old char with new char
		
		String sg="java";
		System.out.println(sg.replace('a', '&'));
		
		//contains =check if the String contains any perticular letter or  not
		
		System.out.println(sg.contains("ja"));
		
		//starts with=check if String Start with perticular letter or not
		System.out.println(sg.startsWith("jav"));
		//endsWith=check if string ends with perticular letter or not
		System.out.println(sg.endsWith("va"));
		//substring
		String s7="javaDeveloper";
		System.out.println(s7.substring(4));
		System.out.println(s7.substring(4, 7));
		
		//is empty=check if String is empty or not
		
		String s8="";
		System.out.println(s8.isEmpty());
		//concat=combine 2 String
		String s9="java";
		String fc="Developer";
		System.out.println(s9.concat(fc));
		
		//charAt=tofind character at perticular index
		System.out.println(s9.charAt(2));
		
		
		//toCharArray=it will convert String into char array
		
		String s12="AbhiDada";
		char[] arr = s12.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}

}
