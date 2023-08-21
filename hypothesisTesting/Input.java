package hypothesisTesting;

public class Input {
	String hypothesisAlter;
	double mean;
	double sampleSize;
	double sampleStatic;
	double standardDeviation;
	public double significanceLevel;
	
	
	public Input(String hypothesisAlter, double mean, double sampleSize, double sampleStatic, double standardDeviation, double significanceLevel){
		this.hypothesisAlter = hypothesisAlter;
		this.mean = mean;
		this.sampleSize = sampleSize;
		this.sampleStatic = sampleStatic;
		this.standardDeviation = standardDeviation;
		this.significanceLevel = significanceLevel;
		
	}
}
