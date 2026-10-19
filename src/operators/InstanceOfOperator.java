package operators;

public class InstanceOfOperator {
	
	
	public static void main(String[] args) {
		
		//it will check weather object belongs to perticular class or not
		//it will return boolean value
		
		String s=new String();
		System.out.println(s instanceof String);
		
		InstanceOfOperator i=new InstanceOfOperator();
		System.out.println(i instanceof InstanceOfOperator);
		
		
		
	}

}
