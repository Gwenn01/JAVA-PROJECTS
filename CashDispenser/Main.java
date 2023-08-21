package CashDispenser;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SetValue setvalue = new SetValue();
		
		
		setvalue.display();
		
		System.out.print("Enter Amount: ");
		int amount = s.nextInt();
		
		Calculated calculated = new Calculated(amount);
		
		calculated.calculated();
		
	}
}
