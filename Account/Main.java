package Account;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Account acc = new Account(1122, 500, 0.50);
		
		System.out.println("========Login======");
		System.out.print("Enter Id: ");
		int id = scan.nextInt();
		
		if(id == acc.getId()) {
			acc.account();
		}else {
			System.out.println("Invalid ID!!");
		}
	
		
		
	}

}
