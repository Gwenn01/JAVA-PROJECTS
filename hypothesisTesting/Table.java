package hypothesisTesting;

public class Table extends Input{

	public Table(String hypothesisAlter, double mean, double sampleSize, double sampleStatic, double standardDeviation,
			double significanceLevel) {
		super(hypothesisAlter, mean, sampleSize, sampleStatic, standardDeviation, significanceLevel);
	}
	
	public double tTableOneTailed() {
		double result = 1.0;
		if(significanceLevel == 0.50) {
			result = 0.00;
		}else if(significanceLevel == 0.25) {
			result = 0.674;
		}else if(significanceLevel == 0.20) {
			result = 0.842;
		}else if(significanceLevel == 0.15) {
			result = 1.036;
		}else if(significanceLevel == 0.10) {
			result = 1.282;
		}else if(significanceLevel == 0.05) {
			result = 1.645;
		}else if(significanceLevel == 0.025) {
			result = 1.960;
		}else if(significanceLevel == 0.01) {
			result = 2.326;
		}else if(significanceLevel == 0.005) {
			result = 2.576;
		}else if(significanceLevel == 0.001) {
			result = 3.090;
		}else if(significanceLevel == 0.0005) {
			result = 3.91;
		}
		
		return result;
	}
public double tTableTwoTailed() {
	double result = 1.0;
	if(significanceLevel == 1.00) {
		result = 0.00;
	}else if(significanceLevel == 0.50) {
		result = 0.674;
	}else if(significanceLevel == 0.40) {
		result = 0.842;
	}else if(significanceLevel == 0.30) {
		result = 1.036;
	}else if(significanceLevel == 0.20) {
		result = 1.282;
	}else if(significanceLevel == 0.10) {
		result = 1.645;
	}else if(significanceLevel == 0.05) {
		result = 1.960;
	}else if(significanceLevel == 0.02) {
		result = 2.326;
	}else if(significanceLevel == 0.01) {
		result = 2.576;
	}else if(significanceLevel == 0.002) {
		result = 3.090;
	}else if(significanceLevel == 0.001) {
		result = 3.91;
	}
	
	return result;
	}
}
