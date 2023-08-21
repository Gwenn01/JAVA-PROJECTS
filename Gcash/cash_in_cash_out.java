package Gcash;
import java.util.*;
public class cash_in_cash_out {
static int BALANCE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		displays();
		int option = 0;
		do {
		option = s.nextInt();
			switch(option) {
			case 1:
				cashIn();
				display();
				break;
			case 2:
				cashOut();
				display();
				break;
			case 3:
				balance();
				display();
				break;
		}
		}while(option != 4);
		
		
	}
	
	public static void displays() {
		System.out.println("====================================");
		System.out.println("            WELCOME TO GCASH        ");
		System.out.println("====================================");
		System.out.println("1. CASH IN                          ");
		System.out.println("2. CASH OUT                         ");
		System.out.println("3. CHECK BALANCE                    ");
		System.out.println("4. EXIT                             ");
		System.out.println("====================================");
	}
	
	public static void display() {
		System.out.println("1. CASH IN                          ");
		System.out.println("2. CASH OUT                         ");
		System.out.println("3. CHECK BALANCE                    ");
		System.out.println("4. EXIT                             ");
	}
	
	public static void cashIn() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int cashIn = s.nextInt();
		BALANCE = BALANCE + cashIn;
		System.out.println("Your Balanace is " + BALANCE);
		
	}
	
	public static void cashOut() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int cashOut = s.nextInt();
		if(cashOut <= BALANCE) {
			BALANCE = BALANCE - cashOut;
			System.out.println("Your Balanace is " + BALANCE);
		}else {
			System.out.println("INSUFFICIENT BALANCE!!");
		}
	}
	
	public static void balance() {
		System.out.println("Your Balanace is " + BALANCE);
	}
	
	
}
