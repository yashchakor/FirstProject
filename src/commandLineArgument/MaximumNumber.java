package commandLineArgument;

public class MaximumNumber {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		int num5 = Integer.parseInt(args[4]);
		int num6 = Integer.parseInt(args[5]);
		int num7 = Integer.parseInt(args[6]);
		int num8 = Integer.parseInt(args[7]);
		int num9 = Integer.parseInt(args[8]);
		System.out.println(Math.max(num1,Math.max(num2, Math.max(num3, Math.max(num4,  Math.max(num5, Math.max(num6, Math.max(num7, Math.max(num8, num9)))))))));
		
		
	}

}
