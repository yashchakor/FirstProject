package latest;

public class Demo {
	
	public int getMarks() {
		int marks=900;
		return marks;
	}
	
	public static void setData(String s) {
		System.out.println(s);
		
		Demo d=new Demo() ;
			int m=d.getMarks();
			System.out.println(m);
			
		
		
		
	}
	
	public static void main(String[] args) {
		
		setData("pooja");
		
	}

}
