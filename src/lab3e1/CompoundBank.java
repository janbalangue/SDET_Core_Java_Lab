package lab3e1;

public class CompoundBank implements Bank {

	@Override
	public double getInterest(double principal, double rate, int termInYears) {
				
		int months = 12;
		
		// assume interest is compounded monthly
		if (termInYears != 0) {
			return principal * Math.pow(1 + rate/months, months * termInYears);
		} else {
			System.out.println("Term in years cannot be zero");
			return 0.0;
		}
	}


}
