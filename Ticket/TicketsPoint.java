package Ticket;
import java.util.*;
public class TicketsPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] description = {"Party       ", "Extra Family", "Family      ", "Duo         ", "Solo        "};
		int[] amount = {500, 350, 150, 120, 45};
		int[] Qty = {15, 10, 4, 3, 1};
		int[] rewardPoints = {5, 4, 2, 1, 0};
		
		System.out.println("Package# Description Amount Qty Reward Points");
		for(int i = 0; i <= amount.length-1; i++) {
			System.out.println((i+1)+  "     " + description[i] + "    "+ amount[i] + "     "+ Qty[i] + "     " + rewardPoints[i]);
		}
		
		System.out.print("Amount: ");
		int inputAmount = s.nextInt();
		
		int resultTicket = 0, resultReward = 0, balance;
		
		while(inputAmount >= amount[4]) {
			
			if(inputAmount >= amount[0]) {
				inputAmount -= amount[0];
				resultTicket += Qty[0];
				resultReward += rewardPoints[0];
			}else if(inputAmount >= amount[1]) {
				inputAmount -= amount[1];
				resultTicket += Qty[1];
				resultReward += rewardPoints[1];
			}else if(inputAmount >= amount[2]) {
				inputAmount -= amount[2];
				resultTicket += Qty[2];
				resultReward += rewardPoints[2];
			}else if(inputAmount >= amount[3]) {
				inputAmount -= amount[3];
				resultTicket += Qty[3];
				resultReward += rewardPoints[3];
			}else if(inputAmount >= amount[4]) {
				inputAmount -= amount[4];
				resultTicket += Qty[4];
				resultReward += rewardPoints[4];
			}
		}
		
		balance = inputAmount;
		
		
		System.out.println("Reuslt: " + resultTicket + " Tickest, " + resultReward + " Reward Points and " + balance + " Balance");
	}

}
