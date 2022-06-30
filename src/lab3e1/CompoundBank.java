package lab3e1;

public class CompoundBank implements Bank {

	@Override
	public String getInterest(double principal, double rate, int termInYears) {
				
		int months = 12;
		
		// assume interest is compounded monthly
		if (termInYears != 0) {
			return formatPrint(principal * Math.pow(1 + percentToDecimal(rate)/months, months * termInYears));
		} else {
			System.out.println("Term in years cannot be zero");
			return formatPrint(0);
		}
	}

}
