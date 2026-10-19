package mockInterview;

public class Demo {
	
	
	int id;
	String name;
	long salary;
	
	public Demo(int id,String name,long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		
		public Demo(Demo s) {
			
			this.id=s.id;
			this.name=s.name;
			this.salary=s.salary;
		
			
			
		}
	
	
	public static void main(String[] args) {
		Demo d=new Demo(1,"Prateek",5421525);
		
		
		Demo d1=new Demo(d);
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.salary);
		System.out.println("-------------------------------");
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.salary);
		
	}

}
