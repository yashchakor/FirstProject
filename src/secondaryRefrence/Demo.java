package secondaryRefrence;

public class Demo {
	
	public static void main(String[] args) {
		Facebook f=new Facebook("yash","102121");
		Instagram i=new Instagram("Prateek","785455");
		SocialMeadia s=new SocialMeadia (f,i);
		
		System.out.println(s.facebook.getUsername());
		System.out.println(s.facebook.getPassword());
		System.out.println("-------------------------");
		
		System.out.println(s.instagram.username);
		System.out.println(s.instagram.password);
		
		
		
	}

}
