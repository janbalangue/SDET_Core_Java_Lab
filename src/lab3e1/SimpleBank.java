package lab3e1;

public class SimpleBank implements Bank {

	@Override
	public String getInterest(double principal, double rate, int term) {
		if (term == 0) {
			System.out.println("Term is " + term);
			return formatPrint(principal);
		}
		return formatPrint(principal * (1 + percentToDecimal(rate) * term));

	}
	

}
