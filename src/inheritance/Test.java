package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		Parent p=new Parent();
		
		p.getParentProp();
		
		
		
		Child c=new Child();
		
		c.getChildProp();
		c.getParentProp();
		
		
		// parent can hold child property
		
		
		Parent p1=new Child();
		
		p1.getParentProp();
		
	}
	

}
