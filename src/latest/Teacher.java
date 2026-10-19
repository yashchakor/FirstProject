package latest;

public class Teacher {
	
	public static void main(String[] args) {
		College c=new College();
		c.printcollegeData();
		 String x=College.getCollegeAddress();
		 System.out.println(x);
		 College c1 = c.getCollegeData();
		System.out.println(c1.collegeName+"  "+c1.collegeAddress+"  "+College.university);
		
	}
}

