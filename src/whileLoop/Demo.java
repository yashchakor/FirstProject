package whileLoop;

import java.util.Scanner;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter how many times you want to print hello word");
//		int endNumber=sc.nextInt();
//		int start=1;
//		
//		
//		while(start<=endNumber) {
//			
//			System.out.println("Hello word");
//			
//			start++;
//		}
		
		
		// print 1 to 5 numbers
		
//		 int  start=1;
//		int end=5;
//		
//		while(start<=end) {
//			
//			System.out.println(start);
//			start++;
//		}
		
		
		//print even numbers from 1 to 10
		
//		int start=1;
//		int end =10;
//		
//		while(start<=end) {
//			
//			if(start%2==0)
//				System.out.println(start);
//			start++;
//		}
		
		//print sum 1 to 5
		
//		int start=1;
//		int end=5;
//		int sum=0;
//		
//		
//		while(start<=end) {
//			
//			sum=sum+start;
//			start++;
//			
//		}
//			System.out.println(sum);
		
		
//		count digits 
//		
//		int num=456;
//		int digits=0;
//		
//		
//		while(num>0) {
//			
//			
//			digits++;
//		
//			num=num/10;
//			
//		}
//		
//		System.out.println("total digits is = "+digits);
		
		
		//count number is divisible by 3
		
//		int start=1;
//		int end=10;
//		int count=0;
//		
//		while(start<=end) {
//			if(start%3==0) {
//				System.out.println(start);
//			count++;
//			}
//			start++;
//			
//		}
//		System.out.println("total = "+count);
		
		//print reverse number
		
//		
//		int num=356;
//		int reverse=0;
//		
//		
//		while(num>0) {
//			
//			int next=num%10;
//			
//			reverse=(reverse*10)+next;
//			num=num/10;
//			
//		}
//		
//		System.out.println(reverse);
//		
		
		//check number is palendrome or not
		
//		
//		int num=121;
//		int m=num;
//		int reverse=0;
//		
//		
//		while(m>0) {
//			
//			int next=m%10;
//			reverse=(reverse*10)+next;
//			m=m/10;
//			
//			
//			
//		}
//		System.out.println(reverse);
//			
//		if( num==reverse) 
//			System.out.println("number is palendrome");
//			
//			else
//				System.out.println("not");
		
//		print sum of digits
		
//		int num=456;
//		
//		int sum=0;
//		
//		
//		while(num>0) {
//			
//			sum=sum+(num%10);
//			num=num/10;
//			
//			
//		}
//			
//		System.out.println(sum);
//		
	// mam ni dilela code for print sum of digits	
//	int num=456;
//		
//		int sum=0;
//	
//		while(num>0) {
//			
//			int last=num%10;
//			
//			sum=sum+last;
//			
//			num=num/10;
//		
//			
//		}
//			
//		System.out.println(sum);
//		
	// print product of digits
		
		
//    int num=456;
//		
//		int sum=1;
//	
//		while(num>0) {
//			
//			 sum=sum*(num%10);
//			
//			
//			
//			num=num/10;
//		
//			
//		}
//			
//		System.out.println(sum);
//		
		
		//check number is Armstrong or not
//
//		int m=370;
//		int num=m;
//		
//		int digits=0;
//		int sum=0;
//		
//		do {
//			digits++;
//			num=num/10;
//		
//	}while(num>0);
//		
//		num=m;
//		
//		while(num>0) {
//			
//		
//			
//			
//		
//		
//		int last=num%10;
//		int next=(int)Math.pow(last, digits);
//		
//		sum=sum+next;
//		
//		num=num/10;
//		
//		
//		}
//		
//		if (m==sum)
//			System.out.println("number is armstrong");
//		
//		else
//			System.out.println("not");
		
		
		//print prime number from 1 to 20
		
		
		
//		int num1=1;
//		int num2=20;
//		int count =0;
//		do {
//		
//		while(num1<=num2) {
//			
//			if(num2%num1==0)
//
//			count++;
//			num1++;
//			
//			
//		}
//		if(count==2)
//			System.out.println(num2+"= is prime number");
//		
//		count=0;
//		num2--;
//		
//		num1=1;
//		
//		
//		}while(num2>=num1);
//		
//		
		// he output saral detay prime number cha
//		int num1 = 1;
//		int num2 = 1;
//		int count = 0;
//
//		do {
//
//		    while (num1 <= num2) {
//
//		        if (num2 % num1 == 0)
//		            count++;
//
//		        num1++;
//		    }
//
//		    if (count == 2)
//		        System.out.println(num2 + " is prime number");
//
//		    count = 0;
//		    num2++;
//		    num1 = 1;
//
//		} while (num2 <= 20);
		
//		
//		int num = 1;
//		int divisor;
//		int count;
//		int primeCount = 0;
//
//		while (num <= 20) {
//
//		    divisor = 1;
//		    count = 0;
//
//		    while (divisor <= num) {
//
//		        if (num % divisor == 0) {
//		            count++;
//		        }
//
//		        divisor++;
//		    }
//
//		    if (count == 2) {
//		        primeCount++;
//		    }
//
//		    num++;
//		}
//
//		System.out.println("Total prime numbers = " + primeCount);
//		
		
	//	Print squares of numbers from 1 to 10.
//		
//		int start=1;
//		int end=10;
//		
//		while(start<=end) {
//			
//			System.out.println(start*start);
//			start++;
//			
//			Find the largest digit in a number.
		
//		int num=354;
//		
//		int largest=0;
//		while(num>0) {
//			
//			int digit=num%10;
//			
//			if(digit>largest)
//				largest=digit;
//			
//			num=num/10;
//		
//		
//		}
//		
//		System.out.println(largest);
		
		//Find the smallest digit in a number
		
		
//		int num=893;
//		int smallest=9;
//		
//		while(num>0) {
//			
//			int digit=num%10;
//			
//			if(digit<smallest)
//				smallest=digit;
//			
//			num=num/10;
//			
//		}
//				
//		System.out.println(smallest);
//		
		
//		Count even and odd digits in a number.
		
//		int num=78952;
//		int r=num;
//		int evenCount=0;
//		int oddCount=0;
//		
//		while(num>0) {
//			
//			int next=num%10;
//			
//			if(next%2==0) {
//				evenCount++;
//			System.out.println(next);
//			}
//			else
//			oddCount++;
//			
//			num=num/10;
//		
//		}
//		System.out.println("total even numbers "+evenCount);
//		System.out.println("total odd number "+(oddCount));
		
		int num=893;
		int smallest=9;
		
		while(num>0) {
			
			int digit=num%10;
			if(digit <smallest){
			smallest=digit;
			}
			
			
			num=num/10;
			
		}
				
		System.out.println(smallest);
		
		
		}
		
	

	}
