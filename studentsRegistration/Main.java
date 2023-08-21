package studentsRegistration;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter how many to be registered: ");
		int registered = scan.nextInt();
		System.out.println();
		scan.nextLine();
		
		Students[] stud = new Students[registered];
		
		for(int i = 0; i < registered; i++) {
			System.out.println("Student# " + (i+1));
			
			System.out.print("First Name: ");
			String firstName = scan.nextLine();
			System.out.print("Last Name:  ");
			String lastName = scan.nextLine();
			System.out.print("Section:    ");
			String section = scan.nextLine();
			System.out.print("Year:       ");
			int year = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			stud[i] = new Students(firstName, lastName, section, year);
			
		}
		
		for(int i = 0; i < stud.length; i++) {
			System.out.print("#" + (i+1));
			stud[i].show();
			System.out.println();
		}
		
		
	}

}
