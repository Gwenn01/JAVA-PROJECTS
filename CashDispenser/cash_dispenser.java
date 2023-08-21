package CashDispenser;
import java.util.*;
public class cash_dispenser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] value = {1000, 500, 200, 100, 50, 10};
		int[] quantity = {5, 5, 5, 5, 5, 5};
		int[] count = new int[value.length];
		int totalCash = 0;
		
		for(int i = 0; i <= value.length-1; i++) {
			System.out.println(value[i] + " [" + quantity[i] + "]");
			totalCash += value[i] * quantity[i];
		}
			
		System.out.println("Total Cash " + totalCash);
		System.out.print("Input Amount: ");
		int inputAmount = s.nextInt();
		
		boolean isCant = false;
		
		while(inputAmount != 0) {
			if(inputAmount >= value[0] && quantity[0] != 0) {
				inputAmount -= value[0];
				quantity[0]--;
				count[0]++;
			}else if(inputAmount >= value[1] && quantity[1] != 0) {
				inputAmount -= value[1];
				quantity[1]--;
				count[1]++;
			}else if(inputAmount >= value[2] && quantity[2] != 0) {
				inputAmount -= value[2];
				quantity[2]--;
				count[2]++;
			}else if(inputAmount >= value[3] && quantity[3] != 0) {
				inputAmount -= value[3];
				quantity[3]--;
				count[3]++;
			}else if(inputAmount >= value[4] && quantity[4] != 0) {
				inputAmount -= value[4];
				quantity[4]--;
				count[4]++;
			}else if(inputAmount >= value[5] && quantity[5] != 0) {
				inputAmount -= value[5];
				quantity[5]--;
				count[5]++;
			}else {
				isCant = true;
				break;
			}
		}
		
		for(int i = 0; i <= value.length-1; i++) {
			if(count[i] != 0) {
				System.out.println(value[i] + " * " + count[i]);
			}
		}
		
		int totalAmount = 0;
		
		if(isCant) {
			System.out.println("Cna't Complete");
		}else {
			for(int i = 0; i <= value.length-1; i++) {
				System.out.println(value[i] + " [" + quantity[i] + "]");
				totalAmount += value[i] * quantity[i];
			}
		}
		System.out.println("Total Cash: " + totalAmount);
		
		
	}

}
