package ANOVA;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====ANOVA=====");
		
		Anova a = new Anova();
		
		a.value_of_groups();
		System.out.println();
		a.total();
		System.out.println();
		a.squared_value_of_groups();
		System.out.println();
		a.total_squared();
		System.out.println();
		a.sumOfSquaredBetween();
		System.out.println();
		a.totalSumOfSquared();
		System.out.println();
		a.sumOfSquaredWithIn();
		System.out.println();
		a.degreeOfFreedomBetween();
		System.out.println();
		a.degreeOfFreedomWithIn();
		System.out.println();
		a.degreeOfFreedomTotal();
		System.out.println();
		a.meanOfSquaredBetween();
		System.out.println();
		a.meanOfSquaredWithIn();
		System.out.println();
		a.totalCalculated();
		System.out.println();
		
		if(a.t_Cal < a.t_Tab) {
			   System.out.println("============RESULT===========");
			   System.out.println("T-Cal is less than T-Tab     ");
			   System.out.println("Therefore Ho is accepted     ");
			   System.out.println("=============================");
			}else {
				System.out.println("============RESULT===========");
				System.out.println("T-Cal is less than T-Tab     ");
				System.out.println("Therefore Ho is rejecterd    ");
				System.out.println("=============================");
				System.out.println("We need to use Scheffe test");
				a.scheffeTest();
			}
		
		
	}

}
