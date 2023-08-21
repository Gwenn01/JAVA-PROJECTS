package CashDispenser;

public class SetValue {
	public int[] value = {1000, 500, 200, 100, 50, 10};
	public int[] quantity = {5, 5, 5, 5, 5, 5};
	int totalAmount;
	
	public int totalAm() {
		
		for(int i = 0; i < value.length; i++) {
			totalAmount = totalAmount + value[i] * quantity[i];
		}
		
		return totalAmount;
	}
	
	public void display() {
		System.out.println("Value | Quantity");
		for(int i = 0; i < value.length; i++) {
			System.out.println(value[i] + " | " + quantity[i]);
		}
		
		System.out.println("Total Amount: " + totalAm());
	}
	

	
}
