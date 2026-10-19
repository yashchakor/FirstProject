package recursion;

public class Print_EvenNum_1_5 {
	
	
	
public static void print(int n) {
	
	
		
		if(n>10) {
			
			
			return;
		}
		
		else {
			
			
			if(n%2==0) {
				
				System.out.println(n);
		
				print(n+1);
			}
				else {
					print(n+1);

				}


			}
		
	
		
		}

	
	
	public static void main(String[] args) {
		
		
		print(1);
		
		
		
	}

}
