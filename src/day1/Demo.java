package day1;

public class Demo {
	public Mobile getMobileData() {
		
		Mobile m=new Mobile();
		m.price=50000;
		m.companyName="lenovo";
		return m;
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Mobile x = d.getMobileData();
		System.out.println(x.price+"  "+x.companyName);
		
	}

}
