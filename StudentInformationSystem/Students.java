package StudentInformationSystem;
import java.util.Scanner;
public class Students {
	// Node this is the data structure to store our student information
	class Node{
		private int studentNumber;
		private String firstName;
		private String lastName;
		private int yearLevel;
		private String course;
		private int age;
		private Node next;
		
		public Node(int studentNumber, String firstName, String lastName, int yearLevel,  String course, int age) {
			this.studentNumber = studentNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.yearLevel = yearLevel;
			this.course = course;
			this.age = age;
		}
		// overloading with node
		public Node(int studentNumber, String firstName, String lastName, int yearLevel,  String course, int age, Node next) {
			this.studentNumber = studentNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.yearLevel = yearLevel;
			this.course = course;
			this.age = age;
			this.next = next;
		}
	}
	///
	Scanner s = new Scanner(System.in);
	// pointer of our node
	private Node head;
	
	
	//add student method
	public void addStudent(int studentNumber, String firstName, String lastName, int yearLevel,  String course, int age) {
		Node node = new Node(studentNumber, firstName, lastName, yearLevel, course, age);
		
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		System.out.println("Student has been created");
	}
	public void inputs() {
		// inputing the attributes of our node 
		System.out.print("Student Number: ");
		int studentNumber = s.nextInt();
		s.nextLine();
		System.out.print("First Name: ");
		String firstName = s.nextLine();
		System.out.print("Last Name: ");
		String lastName = s.nextLine();
		System.out.print("Year Level: ");
		int yearLevel = s.nextInt();
		s.nextLine();
		System.out.print("Course: ");
		String course = s.nextLine();
		System.out.print("Age: ");
		int age = s.nextInt();
		s.nextLine();
		addStudent(studentNumber, firstName, lastName, yearLevel, course, age);
	}
	// delete single
	void deleteSingle() {
		// base condition
		if(head == null) {
			System.out.println();
			System.out.println("Please Add Stududents First Before Deleting");
			System.out.println();
			return;
		}
		// if we want to delete first students just move head
		System.out.print("Enter Student N0: ");
		int studNum = s.nextInt();
		if(head.studentNumber == studNum) {
			head = head.next;
			System.out.println("This Record is Deleted");
			System.out.println();
			return;
		}
		// if not travel till we find
		Node temp = head;
		Node prev = null;
		boolean isFound = false;
		
		while(temp != null) {
			prev = temp;
			temp = temp.next;
			// check first if its not null
			if(temp == null) {
				break;
			}
			if(temp.studentNumber == studNum) {
				prev.next = temp.next;
				System.out.println("This Record is Deleted");
				System.out.println();
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println();
			System.out.println("Student Number not Found!!!");
			System.out.println("Please Enter Correct Student Number");
			System.out.println();
		}
	}
	// delete all
	void deleteAll() {
		// base condition
		if(head == null) {
			System.out.println();
			System.out.println("Please Add Stududents First Before Deleting");
			System.out.println();
			return;
		}
		System.out.print("Are you sure you want to delete all records? (y/n): ");
		String delete = s.nextLine();
		System.out.println();
		if(delete.equals("y") || delete.equals("Y")) {
			head = null;
			System.out.println("All Records Deleted");
			System.out.println();
		}else {
			return;
		}
	}
	// display all
	void displayAll() {
		// base condition
		if(head == null) {
			System.out.println();
			System.out.println("Please Add Stududents First Before Displaying");
			System.out.println();
			return;
		}
		// store the head so that can't change
		Node temp = head;
		// refer to student
		int student = 1;
		// display
		
		while(temp != null) {
			System.out.println();
			System.out.println(student + ". Student Number: " + temp.studentNumber);
			System.out.println("First Name: " + temp.firstName);
			System.out.println("Last Name: " + temp.lastName);
			System.out.println("Year Level: " + temp.yearLevel);
			System.out.println("Course: " + temp.course);
			System.out.println("Age: " + temp.age);
			System.out.println();
			temp = temp.next;
			student++;
		}
		
	}
	// display single student
	public void displaySingle() {
		// base condition
		if(head == null) {
			System.out.println();
			System.out.println("Please Add Stududents First Before Displaying");
			System.out.println();
			return;
		}
		///
		
		System.out.print("Enter Student N0: ");
		int studNum = s.nextInt();
		
		Node temp = head;
		int student = 1;
		
		boolean isFound = false;
		//
		while(temp != null) {
			if(temp.studentNumber == studNum) {
				System.out.println();
				System.out.println(student + ". Student Number: " + temp.studentNumber);
				System.out.println("First Name: " + temp.firstName);
				System.out.println("Last Name: " + temp.lastName);
				System.out.println("Year Level: " + temp.yearLevel);
				System.out.println("Course: " + temp.course);
				System.out.println("Age: " + temp.age);
				System.out.println();
				isFound = true;
				break;
			}
			temp = temp.next;
			student++;
		}
		//
		// if the loops ends and we don't find a student number like that then display not found
		if(!isFound) {
			System.out.println();
			System.out.println("Student Number not Found!!!");
			System.out.println("Please Enter Correct Student Number");
			System.out.println();
		}
	}
	// edit the student data
	public void editStudent() {
		// base condition
		if(head == null) {
			System.out.println();
			System.out.println("Please Add Stududents First Before Editing");
			System.out.println();
			return;
		}
		///
		System.out.print("Enter Student N0: ");
		int studNum = s.nextInt();
		
		Node temp = head;
		
		boolean isFound = false;
		//
		while(temp != null) {
			if(temp.studentNumber == studNum) {
				editStudent(temp);
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		//
		// if the loops ends and we don't find a student number like that then display not found
		if(!isFound) {
			System.out.println();
			System.out.println("Student Number not Found!!!");
			System.out.println("Please Enter Correct Student Number");
			System.out.println();
		}
		
	}
	// editing the data
	public void editStudent(Node node) {
		int option = 1;
		do {
			System.out.println("Editing Student No:" + node.studentNumber);
			System.out.println("[1] Student Number");
			System.out.println("[2] First Name");
			System.out.println("[3] Last Name");
			System.out.println("[4] Year Level");
			System.out.println("[5] Course");
			System.out.println("[6] Age");
			System.out.println("[0] Exit");
			System.out.print("OPTION enter(1-6): ");
			option = s.nextInt();
			s.nextLine();
			System.out.println();
			
			switch(option) {
			case 1:
				System.out.print("Student Number: ");
				int studentNumber = s.nextInt();
				s.nextLine();

				node.studentNumber = studentNumber;
				break;
			case 2:
				System.out.print("First Name: ");
				String firstName = s.nextLine();
				
				node.firstName = firstName;
				break;
			case 3:
				System.out.print("Last Name: ");
				String lastName = s.nextLine();
				
				node.lastName = lastName;
				break;
			case 4:
				System.out.print("Year Level: ");
				int yearLevel = s.nextInt();
				s.nextLine();
				
				node.yearLevel = yearLevel;
				break;
			case 5:
				System.out.print("Course: ");
				String course = s.nextLine();
				
				node.course = course;
				break;
			case 6:
				System.out.print("Age: ");
				int age = s.nextInt();
				s.nextLine();
				
				node.age = age;
				break;
			case 0:
				break;
			default :
				System.out.println("Invalid Option");
				System.out.println();
			}
			System.out.println("Students Record has been Save.");
			System.out.println();
		}while(option != 0);
	}
	
}
