package day1;

public class Test {
	
	public Laptop getLaptopData() {
		Laptop l=new Laptop();
		l.name="hp";
		l.price=98989;
		return l;
	}
	public static void main(String[] args) {
		Test t= new Test();
		Laptop h = t.getLaptopData();
		System.out.println(h.name+"  "+h.price);
		
	}

}
