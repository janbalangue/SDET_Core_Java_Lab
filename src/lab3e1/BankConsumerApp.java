package lab3e1;

import java.text.NumberFormat;
import java.util.Locale;

public class BankConsumerApp {

	private static final double principal = 10000.00;
	private static final double rate = 3.875;
	private static final int term = 2;
	
	public static void main(String[] args) {
			
		SimpleBank simpleBank = new SimpleBank();
		CompoundBank compoundBank = new CompoundBank();
		
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Principal: " + format.format(principal));
		System.out.println("Rate: " + rate + " percent");
		System.out.println("Term (years): " + term);
		
		String simpleInterest = simpleBank.getInterest(principal, rate, term);
		String compoundInterest = compoundBank.getInterest(principal, rate, term);
		
		System.out.println("\nEnding balance with simple interest: " + simpleInterest);
		System.out.println("Ending balance with compound interest (monthly): " + compoundInterest);
		
	}
	
}
