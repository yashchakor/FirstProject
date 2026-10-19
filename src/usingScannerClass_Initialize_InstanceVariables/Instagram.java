package usingScannerClass_Initialize_InstanceVariables;

public class Instagram {
	int instaId;
	String instaUsername;
	Facebook facebook;
	
	public void set( int instaId ) {
		this.instaId=instaId;
		
	}
	
	public int getId() {
		return instaId;
	}
	
	public void set(Facebook facebook) {
		this.facebook=facebook;
	}
	
	public Facebook getFacebook() {
		return facebook;
	}

}


