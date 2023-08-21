package goldenRatio;

public class Alength extends GoldenRatio{
	
	public Alength(double inputLength) {
		super(inputLength);
	}
	
	public void computeA(){
		a = inputLength;
		ab = a * goldenRatio;
		b = ab - a;
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
		System.out.println("Value of AB = " + ab);
	}
	
	
}
