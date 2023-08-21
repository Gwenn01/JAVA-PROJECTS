package goldenRatio;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a = A, b = B, c = A+B: ");
		char inputGiven = scan.next().charAt(0);
		System.out.print("Enter the length: ");
		double inputLength = scan.nextDouble();
		
		if(inputGiven == 'a') {
			Alength a = new Alength(inputLength);
			a.computeA();
		}else if(inputGiven == 'b') {
			Blength a = new Blength(inputLength);
			a.computeB();
		}else if(inputGiven == 'c') {
			ABlength a = new ABlength(inputLength);
			a.computeAB();
		}else {
			System.out.println("Invalid plss Enter the valid input!!!");
		}
		
		
		
		
	}
}
	
