package StudentInformationSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Students students = new Students();
		
		int option = 1;
		do {
			displayInputs();
			option = scan.nextInt();
			scan.nextLine();
			System.out.println();
			// selecting the input from the user
			switch(option) {
				case 1:
					students.inputs();
					System.out.println();
					break;
				case 2:
					students.displayAll();
					break;
				case 3:
					students.displaySingle();
					break;
				case 4:
					students.deleteAll();
					break;
				case 5:
					students.deleteSingle();
					break;
				case 6:
					students.editStudent();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid Option");
					System.out.println();
			}
		}while(option!=0);
		
		scan.close();
	}
	public static void displayInputs() {
		System.out.println("STUDENT INFORMATION SYSTEM");
		System.out.println("[1] Add New Student");
		System.out.println("[2] Display All Student");
		System.out.println("[3] Display Single Student");
		System.out.println("[4] Delete All Student");
		System.out.println("[5] Delete Single Student");
		System.out.println("[6] Edit Student");
		System.out.println("[0] Exit");
		System.out.print("OPTION enter(1-6): ");
		
	}

}
