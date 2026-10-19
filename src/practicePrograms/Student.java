package practicePrograms;

public class Student {

	int id;
	String name;
	long phoneNumber;
	static String collegeName;//Static is single class level memory  sharing with all the objects

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 1;
		s.name = "Yash";
		s.phoneNumber = 8999151452L;
		s.collegeName = "JSPM";

		Student s1 = new Student();
		s1.id = 2;
		s1.name = "Mahesh";
		s1.phoneNumber = 5655512255L;
		s1.collegeName = "VIT";

		Student s2 = new Student();
		s2.id = 3;
		s2.name = "Prerna";
		s2.phoneNumber = 58845522122L;
		s2.collegeName = "MIT"; //last updated value

		System.out.println(s.id + "  " + s.name + "   " + s.phoneNumber+"  "+s.collegeName);
		System.out.println(s1.id + "  " + s1.name + "   " + s1.phoneNumber+"  "+s1.collegeName);
		System.out.println(s2.id + "  " + s2.name + "   " + s2.phoneNumber+"  "+s2.collegeName);

	}

}
