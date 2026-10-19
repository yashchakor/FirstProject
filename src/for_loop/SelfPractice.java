package for_loop;

import java.util.Scanner;

public class SelfPractice {
	
	
	public static void main(String[] args) {
		
		//print Hello word 5 times
		
//		
//		for(int i=1 ;i<=5;i++ ) {
//			System.out.println("Hello Word");
//		}
		
		//print 1 to 5 numbers
//		
//		for(int i=1;i<=5;i++) {
//			
//			
//			System.out.println(i);
//		}
//			
			// print 1 to 10 even numbers and total even numbers count
		
//		int count=0;
//		for(int i=1;i<=10;i++) {
//			
//			if(i%2==0) {
//				
//				System.out.println(i);
//				
//				count++;
//			}
//			
//		}
//			
//		System.out.println(" total count is= "+count);
//			
		
		// print 5 to 1 numbers
		
//		
//		for(int i=5;i>=1;i--) {
//			
//			System.out.println(i);
//				
//		}
//			
		
		//print sum 1 to 5
//		int sum=0;
//		
//		for(int i=1;i<=5;i++) {
//			
//			sum=sum+i;
//			
//			
//		}
//			
//			System.out.println(sum);
//			
		
		// print product 1 to 5
		
//		int product=1;
//		
//		for(int i=1;i<=5;i++) {
//			
//			product=product*i;
//			
//			
//		}
//			
//			System.out.println(product);
		
		// print sum of even numbers from 1 to 10
		
//		int sum=0;
//		
//		for(int i=1;i<=10;i++) {
//			
//			if(i%2==0) {
//				
//				sum=sum+i;
//				
//				
//			}
//			}
//				
//		System.out.println(sum);
//		
		
		// factorial of any number
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter any number");
//		int num=sc.nextInt();
//		
//		int factorial=1;
//		for(;num>=1;num--) {
//			
//			System.out.print(num+"*");
//			
//			factorial=factorial*num;
//		
//			
//			
//		}
//		
//		System.out.print("\n =" +factorial);
//		
		
		//factor count of 7
		
//		
//		int i=7;
//		int j=1;
//		int factorcount=0;
//		for(;i>=j;j++) {
//			
//			if (i%j==0) {
//				System.out.println(j);
//				factorcount++;
//			}
//			
//		}
//		
//		System.out.println("total factor = "+factorcount);
		
		
		
		// check 7 is prime or not
		
		
		

		
//		int j=1;
//		int factorcount=0;
//		for(int i=7;i>=j;j++) {
//			
//			if (i%j==0) {
//				System.out.println(j);
//				factorcount++;
//			}
//			
//		}
//		
//		if(factorcount==2)
//			System.out.println("number is prime ");
//		
//		else {
//			System.out.println("not prime");
//		}
//		
//		System.out.println("total factor = "+factorcount);	
//		}
//			
//		
		
		
		//print  prime number between 1 to 10 and their count
		
//		int totalprimecount=0;
//		for(int i=1;i<=10;i++) {
//			
//			int factorCount=0;
//			
//			for(int j=1;j<=i;j++) {
//				
//				if(i%j==0)
//					
//					factorCount++;
//				
//				
//			}
//			
//			
//			if(factorCount==2) {
//				System.out.println(i+" = is prime");
//			
//			totalprimecount++;
//			}
//			
//		}
//		
//		System.out.println("total prime numbers is = "+totalprimecount);
//			
//			
		// find n th prime number
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int n=sc.nextInt();
//		
//		int totalprimecount=0;
//		for(int i=1;i<=10;i++) {
//			
//			int factorCount=0;
//			
//			for(int j=1;j<=i;j++) {
//				
//				if(i%j==0)
//					
//					factorCount++;
//				
//				
//			}
//			
//			
//			if(factorCount==2) {
//				System.out.println(i+" = is prime");
//			
//			totalprimecount++;
//			
//			if (totalprimecount==n) {
//				System.out.println("n th prime number is = "+i);
//			break;
//			}
//			}
//			
//		}
//		
//		System.out.println("total prime numbers is = "+totalprimecount);
//			
//			
//		
//		fibonacii series
//		
//		int firstNumber=0;
//		int secondNumber=1;
//		int next;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(firstNumber );
//											//0    1      1      2       3      5       8          13         21         34
//			next=firstNumber+secondNumber; //1=0+1  2=1+1  3=1+2  5=2+3  8=3+5  13=5+8   21=8+13   34=13+21   55=21+34   89=34+55
//			
//			firstNumber=secondNumber;
//			
//			secondNumber=next;
//			
//		}
		
		
		
		//count digits of a number345
//		int digits=0;
//		
//		for(int num=345;num>0; num=num/10) {
//			
//			
//			digits++;
//		
//			
//		}
//		
//		
//		System.out.println(digits);
		
		
		// example of break;
		// break dilyvr direct loop chya baher yetay 1,2 ptint hotay pn 3 nhi hot pn hello print hoyil karan te loop chya baher ahe
		
//		for(int i=1;i<=10;i++) {
//			
//			if(i==3) {
//				
//				break;
//				
//			}
//			
//			System.out.println(i);
//		}
//     System.out.println("hello");	
		
     
		// example of return;
				// return dilyvr direct method  stop hote khalcha kahich print nhi hot hello pn phi hot 
				
//				for(int i=1;i<=10;i++) {
//					
//					if(i==3) {
//						
//						return;
//						
//					}
//					
//					System.out.println(i);
//				}
//		     System.out.println("hello");	
//				
//		
		// example of continue
		//continue current iteration skip karta ani pudchi iteration chalu karta
//		for(int i=1;i<=10;i++) {
//			
//			if(i==3) {
//				
//				continue;
//			
//			}
//			
//			System.out.println(i);
//		}
//		
		
		
		// print even  numbers from 1 to 10 using continue
		
//		
//		for(int i=1;i<=10;i++) {
//			
//			if(i%2!=0) {
//				continue;
//			}
//			
//			System.out.println(i);
//			
//		}
		
		
		// print even numbers 1 to 10 without using if else
		
		
//		for(int i=2;i<=10;i+=2) {
//			
//			System.out.println(i);
//		}
		
		
	// print String character by character
		
		
//		String s="Yash";
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			System.out.println(c);
//			
//		}
//		
//		print string in reverse character by character
		
//		String s="Yash";
//		
//	for(int i=s.length()-1;i>=0;i--) {
//		
//		char c=s.charAt(i);
//		System.out.println(c);
//	}
		
		
		//print char at even index
//		String s="Yash";
//		for(int i=0;i<s.length();i++) {
//			
//			if(i%2==0) {
//			
//			char c=s.charAt(i);
//			System.out.println(c);
//			
//			}
//			
//		}
		
		
		//print count of a character
//		
//		String s="Yasah";
//		int count=0;
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			
//			if(c=='a') {
//				
//				count++;
//			}
//				
//		}
//		
//		System.out.println(count);
//		
//		count white spaces
		
//		
//		String s="Y a sh";
//		int count=0;
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			
//			if(Character.isWhitespace(c)) {
//				
//				count++;
//			}
//				
//		}
//		
//		System.out.println("occurance of whilte space = "+count);
		
		// count digits
		
//		String s="chakoryash78@gmail.com";
//		
//		int countDigits=0;
//		
//		for(int i=0;i<s.length();i++) {
//			
//			char c=s.charAt(i);
//			
//			if(Character.isDigit(c)) {
//				
//				System.out.println(c);
//				countDigits++;
//			}
//			
//			
//			
//		}
//	
//		
//		System.out.println("total digits is =" +countDigits);
//		
		
		// print string in reverse
		
		
//		
//		String s=" Ramesh ";
//		String rev="";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			
//			char c=s.charAt(i);
//			
//			rev=rev+c;
//			
//		}
//		
//		
//		System.out.println(rev);
//		
		
		
		//check string is palendrome or not
		
//		String s="madam";
//		
//		String rev="";
//		
//		
//		for(int i=s.length()-1;i>=0;i-- ) {
//			
//			char c=s.charAt(i);
//			
//			rev=rev+c;
//			
//			
//			
//			
//			
//		}
//			
//			if(s.equals(rev))
//				System.out.println("palandrome");
//			
//			else 
//				System.out.println("not");
//			
//		
		
		String s="adRjiFhgFtf";
		int countUppercase=0;
		int countLowercase=0;
		
		
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			
			if(Character.isUpperCase(c)){
				
				countUppercase++;
				
			}
			
			else {
				countLowercase++;
			}
		}
		
		
		System.out.println("total uppercase letter is ="+countUppercase);
		System.out.println("total countLowercase letter is ="+countLowercase);

		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	
		}
			
	
	
	
		
		
	


