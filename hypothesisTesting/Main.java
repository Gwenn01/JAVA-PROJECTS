package hypothesisTesting;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("============HYPOTHESIS TESTING============");
		System.out.println();
		
		System.out.print("Ennter  Hypothesis Alternative: ");
		String hypothesisAlter = s.nextLine();
		System.out.print("Enter mean μ: ");
		double mean = s.nextDouble();
		System.out.print("Enter  Sample Size n: ");
		double sampleSize = s.nextDouble();
		System.out.print("Enter Sample Static x: ");
		double sampleStatic = s.nextDouble();
		System.out.print("Enter Standard Deviation σ: ");
		double standardDeviation = s.nextDouble();
		System.out.print("Enter  Significance Level α: ");
		double significanceLevel = s.nextDouble();
		
		Input input = new Input(hypothesisAlter, mean, sampleSize, sampleStatic, standardDeviation, significanceLevel);
		CalculatedValue cal = new CalculatedValue(hypothesisAlter, mean, sampleSize, sampleStatic, standardDeviation, significanceLevel);
		Table tab = new Table(hypothesisAlter, mean, sampleSize, sampleStatic, standardDeviation, significanceLevel);
		
		System.out.println();
		if(hypothesisAlter.equals("not equal")) {
			System.out.println("Tab Value: " + tab.tTableTwoTailed());
			if(sampleSize >= 30) {
			System.out.println("Cal Value: " + cal.zCalculatedValue());
			}
			
				if(cal.zCalculatedValue() > tab.tTableTwoTailed()) {
					System.out.println("Null Hypothesis is Rejected");
					System.out.println("Alternative Hypothesis is Accepted");
				}else {
					System.out.println("Null Hypothesis is Accepted");
					System.out.println("Alternative Hypothesis is Rejected");
				}
			
		}else {
			System.out.println("Tab Value: " + tab.tTableOneTailed());
			if(sampleSize >= 30) {
				System.out.println("Cal Value: " + cal.zCalculatedValue());
				}
				
					if(cal.zCalculatedValue() > tab.tTableOneTailed()) {
						System.out.println("Null Hypothesis is Rejected");
						System.out.println("Alternative Hypothesis is Accepted");
					}else {
						System.out.println("Null Hypothesis is Accepted");
						System.out.println("Alternative Hypothesis is Rejected");
					}
		}

	}
}
