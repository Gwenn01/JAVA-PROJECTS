package goldenRatio;

public class ABlength extends GoldenRatio{
	
	public ABlength(double inputLength) {
		super(inputLength);
	}
	
	public void computeAB(){
			ab = inputLength;
			a = ab / goldenRatio ;
			b = ab - a;
			System.out.println("Value of A = " + a);
			System.out.println("Value of B = " + b);
			System.out.println("Value of AB = " + ab);
	}
}
