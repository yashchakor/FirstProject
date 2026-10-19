package for_Each_Loop;

public class Student {
	
	
	public static void main(String[] args) {
		
		//print longest String
		
//		String s = "my name";
//		String add = "";
//		String longest = "";
//
//		for (int i = 0; i < s.length(); i++) {
//
//		    char c = s.charAt(i);
//
//		    if (Character.isLetter(c)) {
//		        add = add + c;
//		    }
//		    else {
//		        if (add.length() > longest.length()) {
//		            longest = add;
//		        }
//
//		        add = "";
//		    }
//		}
//
//		// शेवटचा word check करण्यासाठी
//		if (add.length() > longest.length()) {
//		    longest = add;
//		}
//
//		System.out.println("Longest String = " + longest);
				
		// print first letter into uppercase
		
		
		String s = "my name is suyash";

		String[] words = s.split(" ");

		for (String word : words) {

		    char first = Character.toUpperCase(word.charAt(0));

		    System.out.print(first + word.substring(1) + " ");
		}		
				
				
		
	}

}
