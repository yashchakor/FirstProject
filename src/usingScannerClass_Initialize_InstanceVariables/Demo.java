package usingScannerClass_Initialize_InstanceVariables;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Facebook fb=new Facebook();
		fb.set(101);
		Instagram i=new Instagram();
		i.set(102);
		i.set(fb);
		
		System.out.println(i.instaId);
		System.out.println(i.getFacebook().get());
		
		
	}

}
