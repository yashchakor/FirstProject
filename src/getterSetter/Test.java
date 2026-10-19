package getterSetter;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		
		s.setId(1);
		s.setName("pooja");
		
		System.out.println(s.getId()+"  "+s.name);
	}

}
