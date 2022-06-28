package lab3e1;

import java.text.NumberFormat;
import java.util.Locale;

public class BankConsumerApp {

	private static double principal;
	private static double rate;
	private static int term;
	
	public static void main(String[] args) {
		
		principal = 10000.00;
		rate = .03875;
		term = 2;
			
		SimpleBank simpleBank = new SimpleBank();
		CompoundBank compoundBank = new CompoundBank();
		
		double simpleInterest = simpleBank.getInterest(principal, rate, term);
		double compoundInterest = compoundBank.getInterest(principal, rate, term);
		
		System.out.println("Principal: " + formatPrint(principal));
		System.out.println("Rate: " + rate * 100 + " percent");
		System.out.println("Term in years: " + term);
		
		System.out.println("Ending balance with simple interest: " + formatPrint(simpleInterest));
		System.out.println("Ending balance with compound interest (monthly): " + formatPrint(compoundInterest));
		
	}
	
	public static String formatPrint(double value) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		return formatter.format(value);
	}

}
