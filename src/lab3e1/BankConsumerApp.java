package lab3e1;

import java.text.NumberFormat;
import java.util.Locale;

public class BankConsumerApp {

	private static double principal;
	private static double rate;
	private static int term;
	
	public static void main(String[] args) {
		
		principal = 10000.00;
		rate = 3.875;
		term = 2;
			
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
