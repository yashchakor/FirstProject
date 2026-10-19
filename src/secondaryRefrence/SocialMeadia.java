package secondaryRefrence;

public class SocialMeadia {
	
	Facebook facebook;
	Instagram instagram;
	public SocialMeadia(Facebook facebook, Instagram instagram) {
		super();
		this.facebook = facebook;
		this.instagram = instagram;
	}
	public SocialMeadia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facebook getFacebook() {
		return facebook;
	}
	public void setFacebook(Facebook facebook) {
		this.facebook = facebook;
	}
	public Instagram getInstagram() {
		return instagram;
	}
	public void setInstagram(Instagram instagram) {
		this.instagram = instagram;
	}
	
	
	

}
