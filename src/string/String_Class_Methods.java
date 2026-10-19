package string;

import java.util.Arrays;

public class String_Class_Methods {
	
	
	public static void main(String[] args) {
		
		//equals()
		
		String s1="yash";
		String s2="Yash";
		
		
		System.out.println(s1.equals(s2));//false
		
		//equalsIgnore()
		
		System.out.println(s1.equalsIgnoreCase(s2));//true

		//trim()
		
		String s3=" yash ";
		
		System.out.println(s3.trim());//yash-it can remove white space before and after the string but it can not remove the space between char
		
		
		//compareTo()
		
		String s4="a";
		String s5="b";
		
		System.out.println(s4.compareTo(s5));//-1
		
		System.out.println(s1.compareTo(s2));//32
		
		//compareToIgnoreCase()
		
		System.out.println(s1.compareToIgnoreCase(s2));//0
		
		
		
		//length();
		
		
		System.out.println(s1.length());//4
		
		//replace()
		
		String s6="ramesh";
		System.out.println(s6.replace('m', 'y'));//rayesh
		String s7="java";
		System.out.println(s7.replace('a', 's'));//jsvs
		
		
		//contains()
		
	
		System.out.println(s7.contains("ava"));//true
		//startsWith
		
		System.out.println(s7.startsWith("j"));//true
		//endsWith
		
		System.out.println(s7.endsWith("a"));//true
		
		
		//subString()
		
		String s8="pythondeveloper";
		
		System.out.println(s8.substring(6));//developer
		
		System.out.println(s8.substring(6, 9));//dev
		
		
		//isEmpty()
		
		
		System.out.println(s8.isEmpty());//false
		
		//concat
		
		
		String s9="python";
		String s10="developer";
		System.out.println(s9.concat(s10));//pythondeveloper
		
		
		//charAt()
		
		System.out.println(s9.charAt(1));//y
		
		char[] e = s9.toCharArray();
		
		System.out.println(Arrays.toString(e));//[p, y, t, h, o, n]
		
		
		//indexof
		
		String t="java";
		System.out.println(t.indexOf('a'));//1 first occurance
		
		
		//lastIndexOf
		System.out.println(t.lastIndexOf('a'));//3 last occurance
		
		// toUppercase
		
		System.out.println(t.toUpperCase());//JAVA
		
		//tolowercase
		
		String v="JAVA";
		System.out.println(v.toLowerCase());
		
	}

}
