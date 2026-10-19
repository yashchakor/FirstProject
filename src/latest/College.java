package latest;

public class College {
	
	String collegeName;
	String collegeAddress;
	static String university="sppu";
	
	public void printcollegeData() {
		collegeName="jspm";
		collegeAddress="wagholi";
		
		System.out.println(collegeName+"  "+ collegeAddress+"  "+university);
		
		
	}
	
	public static String getCollegeAddress() {
		College c=new College ();
		c.collegeAddress="mumbai";
	
		return c.collegeAddress ;
	}
	
	public College getCollegeData() {
		College c=new College();
		c.collegeName="jspm";
		c.collegeAddress="wagholi";
		
		
	
		return c;
		
		
		
		
		
	}

}
