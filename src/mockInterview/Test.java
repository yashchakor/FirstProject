package mockInterview;

public class Test {
	//π × r²
	//Length × Breadth
	//½ × Base × Height
	double PI=3.14;
	int radius=2;
	static int length=4;
	static int breadth=6;
	int base= 3;
	int height=5;
	double r =0.5;
	
	
	
	public static int getAreaOfRectangle() {
		
		
		
		return length*breadth ;
		
		
	}
	
	public double getPerimeterOfCircle() {
		
		return PI*radius*radius;
	}
	
	public double getAreaofTriangle() {
		
		return r*base*height ;
	}
	
	
	public static void main(String[] args) {
		int x = getAreaOfRectangle();
		Test t=new Test();
		
		
		System.out.println(t.getAreaOfRectangle());
		System.out.println(t.getPerimeterOfCircle());
		System.out.println(t.getAreaofTriangle());
		
		
	}

}
