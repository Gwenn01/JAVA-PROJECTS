package studentsRegistration;

public class Students {
	 String firstName;
	 String lastName;
	 String section;
	 int year;
	
	public Students(String firstName, String lastName, String section, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.year = year;
	}
	
	public void show() {
		System.out.println("Full Name: " + firstName + " " +  lastName);
		System.out.println("Year Section: " +  year + " " +  section);
		System.out.println();
	}
}
