package ANOVA;

import java.util.Scanner;

public class Anova {
	Scanner scan = new Scanner(System.in);
	
	int Glength = groups();
	int Llength = length();
	
	double[][] valueOfGroups = new double[Glength][Llength];
	double[] total = new double[Glength];
	double[][] squaredValueOfGroups = new double[Glength][Llength];
	double[] totalSquared = new double[Glength];
	
	int n = Llength;
	int N = Llength * Glength;
	double SSB, TSS, SSW;
	int k =  Glength;
	double dfB, dfW, dfT;
	double MSB, MSW;
	double t_Cal;
	double t_Tab;
	
	//Inputss
	public int groups() {
		System.out.print("Enter how many Goups: ");
		int groups = scan.nextInt();
		return groups;
	}
	public int length() {
		System.out.print("Enter the length per Group: ");
		int length = scan.nextInt();
		return length;
	}
	
	
	public void value_of_groups() {
		for(int i = 0; i < valueOfGroups.length; i++) {
			System.out.println("GROUP" + (i+1) + ": ");
			for(int j = 0; j < valueOfGroups[i].length; j++) {
				System.out.print("Enter Value" + (j+1) + " : ");
				valueOfGroups[i][j] = scan.nextDouble();
			}
		}
	}
	
	public void total() {
		int sum = 0;
		for(int i = 0; i <  valueOfGroups.length; i++) {
			for(int j = 0; j < valueOfGroups[i].length; j++) {
				sum += valueOfGroups[i][j];
			}
			total[i] = sum;
			sum = 0;
			System.out.println("Total Group" + (i+1) + " " + total[i]);
		}
	}
	
	public void squared_value_of_groups() {
		
		for(int i = 0; i < squaredValueOfGroups.length; i++) {
			System.out.println("GROUP" + (i+1) + "SQUARED: ");
			for(int j = 0; j < squaredValueOfGroups[i].length; j++) {
				 squaredValueOfGroups[i][j] = (valueOfGroups[i][j] * valueOfGroups[i][j]);
				 System.out.println("Value" + (j+1) + " Squared " + squaredValueOfGroups[i][j]);
			}
		}
	}
	

	public void total_squared() {
		int sum = 0;
		for(int i = 0; i <  squaredValueOfGroups.length; i++) {
			for(int j = 0; j < squaredValueOfGroups[i].length; j++) {
				sum += squaredValueOfGroups[i][j];
			}
			totalSquared[i] = sum;
			sum = 0;
			System.out.println("Total Group Squared" + (i+1) + " " + totalSquared[i]);
		}
	}
	//Inputs
	
	//
	public void sumOfSquaredBetween() {
		double ssb1 = 0, ssb2 = 0;
		for(int i = 0; i < this.total.length; i++) {
			ssb1 += (total[i] * total[i]);
		}
		ssb1 /= n;
		
		for(int i = 0; i < this.total.length; i++) {
			ssb2 += total[i];
		}
		ssb2 = (ssb2 * ssb2);
		ssb2 /= N;
		System.out.println("Sum of Squared Between");
		System.out.println(ssb1 + "  -  " + ssb2);
		SSB = ssb1 - ssb2;
		System.out.println("SSB = " + this.SSB);
	}
	
	public void totalSumOfSquared() {
		double tss1 = 0, tss2 = 0; 
		
		for(int i = 0; i < totalSquared.length; i++) {
			tss1 += totalSquared[i];
		}
		for(int i = 0; i < this.total.length; i++) {
			tss2 += total[i];
		}
		tss2 = (tss2 * tss2);
		tss2 /= N;
		System.out.println("Total Sum of Squared");
		System.out.println(tss1 + "  -  " + tss2);
		TSS = tss1 - tss2;
		System.out.println("TSS = " + this.TSS);
		
	}
	
	public void sumOfSquaredWithIn() {
		this.SSW = TSS - SSB;
		System.out.println("TSS = " +  TSS + " - " + "SSB = " + SSB);
		System.out.println("SSW = " + SSW);
	}
	//
	//
	public void degreeOfFreedomBetween() {
		this.dfB = k -1;
		System.out.println("Degree of Freedom Between");
		System.out.println("k - 1");
		System.out.println(k +  " - " + 1);
		System.out.println("dfB = " + dfB);
	}
	public void degreeOfFreedomWithIn() {
		this.dfW = N - k;
		System.out.println("Degree of Freedom With In");
		System.out.println("N - k");
		System.out.println(N +  " - " + k);
		System.out.println("dfW = " + dfW);
	}
	public void degreeOfFreedomTotal() {
		this.dfT = dfB + dfW;
		System.out.println("Degree of Freedom Total");
		System.out.println("dfB + dfW");
		System.out.println(dfB +  " + " + dfW);
		System.out.println("dfT = " + dfT);
	}
	//
	//
	public void meanOfSquaredBetween() {
		this.MSB = SSB / dfB;
		System.out.println("Mean Squared Between");
		System.out.println("SSB / dfB");
		System.out.println(SSB +  " / " + dfB);
		System.out.println("MSB = " + MSB);
	}
	public void meanOfSquaredWithIn() {
		this.MSW = SSW / dfW;
		System.out.println("Mean Squared With In");
		System.out.println("MSW / dfW");
		System.out.println(SSW +  " / " + dfW);
		System.out.println("MSW = " + MSW);
	}
	//
	//
	public void totalCalculated(){
		
		this.t_Cal = MSB / MSW;
		System.out.println("Total Cal");
		System.out.println("MSB / MSW");
		System.out.println(MSB +  " / " + MSW);
		System.out.println("===========================");
		System.out.println("| T CAL = " + t_Cal + "| ");
		System.out.println("===========================");
		System.out.println();
		
		System.out.print("Enter the t-tab: ");
		this.t_Tab = scan.nextDouble();
		System.out.println("===========================");
		System.out.println("| T TAB = " + t_Tab + "| ");
		System.out.println("===========================");
		System.out.println();
	}
	
	public void scheffeTest() {
		double[] GroupX = new double[this.Glength];
		
		for(int i = 0; i < total.length; i++) {
		    GroupX[i] = total[i] / n;
		}
		System.out.println("XA = " + GroupX[0]);
		System.out.println("XB = " + GroupX[1]);
		System.out.println("XC = " + GroupX[2]);
		System.out.println();
		double F, AvB, AvC, BvC, F_Tab;
		double AvBS, AvCS, BvCS;
		double temp1, temp2;
		temp1 = MSW * (n + n);
		temp2 = n * n;
		F = temp1 / temp2;
		System.out.println("MSW(n1+n2)");
		System.out.println("---------");
		System.out.println("  (n)(n)  ");
		System.out.println(" = " + F);
		System.out.println();
		
		AvBS = (GroupX[0] - GroupX[1]) * (GroupX[0] - GroupX[1]);
		AvCS = (GroupX[0] - GroupX[2]) * (GroupX[0] - GroupX[2]);
		BvCS = (GroupX[1] - GroupX[2]) * (GroupX[1] - GroupX[2]);
		 
		AvB = AvBS / F;
		AvC = AvCS / F;
		BvC = BvCS / F;
		
		System.out.println("AVB = " + AvB);
		System.out.println("AVC = " + AvC);
		System.out.println("BVC = " + BvC);
		System.out.println();
		F_Tab = (Glength - 1) * (t_Tab);
		
		boolean isAVBsig = false;
		boolean isAVCsig = false;
		boolean isBVCsig = false;
		
		System.out.print("AVB | " + AvB + " | " + F_Tab + " | ");
		if(AvB > F_Tab) {
			System.out.println("Significant");
			isAVBsig = true;
		}else {
			System.out.println("No");
		}
		System.out.println();
		
		
		
		System.out.print("AVC | " + AvC + " | " + F_Tab + " | ");
		if(AvC > F_Tab) {
			System.out.println("Significant");
			isAVCsig = true;
		}else {
			System.out.println("No");
		}
		System.out.println();
		
		
		
		System.out.print("BVC | " + BvC + " | " + F_Tab + " | ");
		if(BvC > F_Tab) {
			System.out.println("Significant");
			isBVCsig = false;
		}else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println();
		
		if(isAVBsig && isAVCsig) {
			System.out.println("=====ANSWER=====");
			System.out.println("      AVB       ");
			System.out.println("      AVC       ");
			System.out.println();
			System.out.println("================");
			System.out.println("Group A");
			System.out.println("================");
		}else if(isAVCsig && isBVCsig) {
			System.out.println("=====ANSWER=====");
			System.out.println("      AVC       ");
			System.out.println("      BVC       ");
			System.out.println();
			System.out.println("================");
			System.out.println("Group C");
			System.out.println("================");
		}else if(isAVBsig && isBVCsig) {
			System.out.println("=====ANSWER=====");
			System.out.println("      AVB       ");
			System.out.println("      BVC       ");
			System.out.println();
			System.out.println("================");
			System.out.println("Group B");
			System.out.println("================");
		}
		
	}
	
}
