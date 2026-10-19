package recursion;

public class Test {
	
	public static void printMsg(int n) {
		
		if(n<=0)
			return;
		
		
		System.out.println("hello world");
		
		printMsg(n-1);
	}
	
	public static void main(String[] args) {
		
		printMsg(5);
		
		
		
	}

}
