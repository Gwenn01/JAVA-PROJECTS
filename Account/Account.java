package Account;
import java.util.Scanner;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
				
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id; 
	}
	public void setBalnace(int balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance; 
	}
	
	
	public boolean withdraw(double amount) {
		boolean result;
		if(balance >= amount) {
			balance -= amount;
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	public double deposit(double amount) {
		return balance += amount;
		
	}
	
	public void account() {
		Scanner s = new Scanner(System.in);
		System.out.println("=======WELCOME USER=====");
		int option = 0;
		int amount;
		do {
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.print("OPTION: ");
			option = s.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("BALANCE: " + getBalance());
				break;
				case 2:
					System.out.print("WITHDRAW: ");
					amount = s.nextInt();
					
					if(withdraw(amount) == true) {
						System.out.println("YOUR WITHDRAW IS SUCESSFULL!!");
						withdraw(amount);
						System.out.println("BALANCE: " + getBalance());
					}else {
						System.out.println("FAILED INSUFFICIENT BALANCE!!");
						System.out.println("BALANCE: " + getBalance());
					}
				break;
				case 3:
					System.out.print("DEPOSIT: ");
					amount = s.nextInt();
					deposit(amount);
					System.out.println("BALANCE: " + getBalance());
					System.out.println("YOUR DEPOSIT IS SUCESSFULL!!");
				break;
			}
		}while(option != 4);
	}
}
