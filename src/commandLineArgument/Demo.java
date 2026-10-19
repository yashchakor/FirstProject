package commandLineArgument;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Demo {
	
	public static void main(String[] args) {
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println(n1+n2);
		
		System.out.println(args.length);
		
		System.out.println();
		
	}

}
