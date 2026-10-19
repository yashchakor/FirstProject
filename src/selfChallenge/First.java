package selfChallenge;

public class First {
	
	
	int id ;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public First(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "First [id=" + id + ", name=" + name + "]";
	}
	
	

}
