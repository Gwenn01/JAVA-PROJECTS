package CashDispenser;

public class Calculated extends SetValue{
	public int[] count = new int[value.length];
	boolean isCant = false;
	public int inputAmount;
	
	public Calculated(int inputAmount) {
		this.inputAmount = inputAmount;
	}
	
	public void calculated() {
		
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
		
		totalAmount = 0;
		
		display();
		totalAm();
	}
}
