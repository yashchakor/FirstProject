package operators;

public class CharacterclassMethods {
	public static void main(String[] args) {
		//equals =to check equality
		Character a='s';
		Character b='s';
		System.out.println(a.equals(b));
		//CompareTo=use for sorting +ve,-ve,0
		Character c='a';
		Character d='z';
		
	
		System.out.println(a.compareTo(b));
		System.out.println(c.compareTo(d));
		
		//tolowercase=convert into lowercase
		
		Character c1='A';
		System.out.println(Character.toLowerCase(c1));
		Character c2='a';
		System.out.println(Character.toUpperCase(c2));
		
		//isDigit=check if char is digit or not
		Character c3='2';
		System.out.println(Character.isDigit(c3));
		//isLetter=check if given char is letter or not
		System.out.println(Character.isLetter(c2));
		//isAlphabetic=check if given char is alphabetic or not
		System.out.println(Character.isAlphabetic(c2));
		//isLowercase=check if given character in lowercase or not
		Character s1='p';
		
		System.out.println(Character.isLowerCase(s1));
		//isUppercase=check if given character is in uppercase or not
		Character s2='W';
		System.out.println(Character.isUpperCase(s2));
		//isWhiteSpace=check is whitespaceor not
		Character d1=' ';
		System.out.println(Character.isWhitespace(d1));
		System.out.println("---------");
		
		Character f1='a';
		System.out.println(Character.isLetterOrDigit(f1));
		
		
	}

}
