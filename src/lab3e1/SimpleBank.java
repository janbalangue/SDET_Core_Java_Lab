package lab3e1;

public class SimpleBank implements Bank {

	@Override
	public double getInterest(double principal, double rate, int term) {
		if (term == 0) {
			System.out.println("Term is " + term);
			return principal;
		}
		return principal * (1 + rate * term);

	}
	

}
