package secondaryRefrence;

public class Demo1 {
	
	public static void main(String[] args) {
		Teacher t=new Teacher(101,"Geet");
		College c=new College(102,"Jspm",t);
		University u=new University(102,"sppu",c);
		
		
		System.out.println(u.getId());
		System.out.println(u.getUniversityName());
		
		System.out.println("------------------");
		
		System.out.println(u.getCollege().getId());
		System.out.println(u.getCollege().getCollegeName());
		
		System.out.println("-------------------------");
		
		System.out.println(u.getCollege().getTeacher().getId());
		System.out.println(u.getCollege().getTeacher().getTeacherName());
	}

}
