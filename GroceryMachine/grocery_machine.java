package GroceryMachine;
import java.util.*;
public class grocery_machine {
static int AMOUNT;
static int price;
static int quantity;
static int product = 0;
static int[] Qty = new int[100];
static int[] Price = new int[100];
static int fee;
static int change;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		displays();
	
		do
		{		
		int option = s.nextInt();		
			if(option == 1) {
				compute();
				display();
			}else if(option == 2) {
				total();
				fee();
				break;
			}else if(option == 3) {
				break;
			}
		}while(true);
		receipt();
		
	}
	public static void displays() {
		System.out.println("===============================");
		System.out.println("       WELCOME TO CASHIER      ");
		System.out.println("===============================");
		System.out.println("1. Enter the Amount of Product");
		
	}
	public static void display() {
		System.out.println();
		System.out.println("1. Enter Again");
		System.out.println("2. Total");
		System.out.println("3. Exit");
		System.out.print("OPTION: ");
	}
	
	public static void compute() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Price: ");
		price = s.nextInt();
		System.out.print("Quatity: ");
		quantity = s.nextInt();
		AMOUNT = AMOUNT + (price * quantity);
		Price[product] = price;
	    Qty[product] = quantity;
	    product++;
		
	}
		
	public static void fee() {
		Scanner s = new Scanner(System.in);
		int result;
		System.out.print("Customer fee: ");
		fee = s.nextInt();
		do {
			if(fee < AMOUNT) {
				System.out.println("Insufficient Fee");
				System.out.print("Enter your fee again: ");
				fee = s.nextInt();
			}		
		}while(fee < AMOUNT);
		change = fee - AMOUNT;
		System.out.println("Customer change " + change);
	}
	public static void total() {
		System.out.println("The Total amount is " + AMOUNT);
	}
	
	public static void receipt() {
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		System.out.println("               CASH RECEIPT             ");
		System.out.println("========================================");
		for(int i = 0; i < product; i++) {
            System.out.println("Product " + i + "   Quantity "+ Qty[i] + "    Price " + Price[i]);
        }
		System.out.println("                          The total: " + AMOUNT);
		System.out.println("   Customer fee: " + fee);
		System.out.println("   Customer change: " + change);
	}
}
