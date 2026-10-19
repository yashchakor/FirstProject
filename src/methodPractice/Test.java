package methodPractice;

//public class Test {
//	public void get() {   //this is type 1
//		System.out.println("prerna");
//		
//	}
//	
//	public static void main(String[] args) {
//		Test t=new Test();
//		t.get();
//		
//	}
//
//}

//public class Test{
//	
//	public static void get() { //this is type 2
//		System.out.println("satyajeet");
//		
//	}
//	
//	public static void main(String[] args) {
//		get();
//	}
//	
//}

//public class Test{
//	
//	
//	public int get() { //this is type 3
//		return 20;
//	}
//	
//	public static void main(String[] args) {
//		Test t=new Test();
//		System.out.println(t.get());
//	}

//public class Test{
//	
//	
//	public static int get() {  //this is type 4
//		return 20;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(get());
//	}
	
//public class Test{
//	
//	public void set(int a,int b) //this is type 5
//		System.out.println(a+b);		
//	}
//	public static void main(String[] args) {
//		Test t=new Test();
//		 t.set(20, 30);
//		
//	}
//	
	
//public class Test{
//	
//	public static String set(int a ,String name) {
//		
//		return a+"  " +name;
//	}
//public static void main(String[] args) {
//      String x = set(10,"pooja");
//      
//      System.out.println(x);
//}

//public class Test{
//	
//	public static void setEmployeeData(Employee e) {
//		System.out.println(e.id+"  "+e.name+"  "+e.salary);
//		
//	}
//	public static void main(String[] args) {
//		
//		Employee e=new Employee();
//		e.id=5;
//		e.name="priyu";
//		e.salary=10.20;
//		setEmployeeData(e);
//		
//	}
//}

//public class Test{
//	
//	public static Employee getEmployeeData() {
//		Employee e=new Employee();
//		e.id=10;
//		e.name="yash";
//		e.salary=10.20;
//		
//		return e ; 
//		
//		
//		
//	}
//	public static void main(String[] args) {
//	Employee x=getEmployeeData();
//		System.out.println(x.id+" "+x.name+" "+x.salary);
//		
//	}
public class Test{
	public static void printEmployeeData(Employee emp) {
		emp.id=50;
		emp.name="kajal";
		emp.salary=50.20;
//	System.out.println(e.id+" "+e.name+" "+e.salary);
		
	}
	public static void main(String[] args) {
		Test t =new Test();
		Employee e=new Employee();
		
		
		t.printEmployeeData(e);
		System.out.println(e.id+e.name);
		
		
	}
}