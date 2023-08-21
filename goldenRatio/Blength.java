package goldenRatio;

public class Blength extends GoldenRatio{
	
	public Blength(double inputLength) {
		super(inputLength);
	}
	
	public void computeB(){
		b = inputLength;
		a = b * goldenRatio;
		ab = a + b;
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
		System.out.println("Value of AB = " + ab);
	}
}
