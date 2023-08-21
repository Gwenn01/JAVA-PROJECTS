package hypothesisTesting;
import java.util.*;
public class CalculatedValue extends Input{
	double calc;
	public CalculatedValue(String hypothesisAlter, double mean, double sampleSize, double sampleStatic,
			double standardDeviation, double significanceLevel) {
		super(hypothesisAlter, mean, sampleSize, sampleStatic, standardDeviation, significanceLevel);
		
	}
	
	public double zCalculatedValue() {
		if(mean > sampleStatic) {
		calc = ((mean - sampleStatic) / standardDeviation) * Math.sqrt(sampleSize);
		}else {
		calc = ((sampleStatic - mean) / standardDeviation) * Math.sqrt(sampleSize);	
		}
		
		
		return calc;
	}

}
