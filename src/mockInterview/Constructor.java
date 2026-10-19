package mockInterview;

public class Constructor {

	int id;
	String name;
	long salary;
	String village;
	static double km;

	public Constructor(int id) {
		this.id=id;

	}

	public Constructor(int id,String name) {
		this .id=id;
		this.name=name;

	}
	public Constructor(int id ,String name,long salary,String village,double km) {
		this .id=id;
		this.name=name;
		this.salary=salary;
		this.km=km;
		this.village=village;

	}

	public Constructor(int id ,String name,long salary) {
		this .id=id;
		this.name=name;
		this.salary=salary;

	}

	public Constructor(int id ,String name,long salary,String village) {
		this .id=id;
		this.name=name;
		this.salary=salary;
		this.village=village;

	}

	

	public static void main(String[] args) {
		
		Constructor c=new Constructor(1);
		Constructor c1=new Constructor(2,"yash");
		Constructor c2=new Constructor(3,"Priyu",5000l);
		Constructor c3=new Constructor(4,"mahesh",40000l,"ashti");
		Constructor c4=new Constructor(5,"pratik",20000,"sangli",20);
        System.out.println(c.id+km);
        System.out.println(c1.id+"  "+c1.name+km);
        System.out.println(c2.id+" "+c2.name+"  "+c2.salary +km);
        System.out.println(c3.id+"  "+c3.name+"  "+c3.salary+"  "+c3.village+km);
        System.out.println(c4.id+"  "+c4.name+"  "+c4.salary+"  "+c4.village+"  "+c4.km);
        
		

	}

}
