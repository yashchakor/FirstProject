package constructor;

public class Abhi {
	
	
	
public static void main(String[] args) {

	Prince p=new Prince();
	
	p.id=1;
	p.name="Aditya";
	
	
	System.out.println(p.id+"  "+p.name);
	
	Prince p1=new Prince();
	p1.id=2;
	p1.name="Swati";
	
	System.out.println(p1.id+p1.name);
	Prince p2=new Prince(10,"yash");
	System.out.println(p2.id+"  "+p2.name);

	
	
	
}
}
