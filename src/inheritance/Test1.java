package inheritance;

public class Test1 {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		GrandParent g=new GrandParent();
		g.getGrandParentProp();
		
		Parent1 p1=new Parent1();
		
		p1.getParentProp();
		p1.getGrandParentProp();
		
		
		Child1 c1 =new Child1();
		
		c1.getChildProp();
		c1.getChildProp();
		c1.getGrandParentProp();
		
		
		// grand parent can hold parent class property
		
		GrandParent g1=new Parent1();
		
		g1.getGrandParentProp();
		
		
		//parent can hold child class property
		
		Parent1 p2=new Child1();
		
		p2.getParentProp();
		p2.getGrandParentProp();
		
		//Grandparent can hold child class property
		GrandParent p=new Child1();
		p.getGrandParentProp();
	
		
		
	}

}
