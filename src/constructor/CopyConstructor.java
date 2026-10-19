package constructor;

public class CopyConstructor {
	
	int id;
	String n;
	
	CopyConstructor(int id,String s){
		
		
		
	}
	CopyConstructor(CopyConstructor c){
		this.id=c.id;
		this.n=c.n;
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		CopyConstructor c=new CopyConstructor(10,"Pravin");
		CopyConstructor c1=new CopyConstructor(c);
		
	}

}
