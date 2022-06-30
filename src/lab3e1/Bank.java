package lab3e1;

import java.text.NumberFormat;
import java.util.Locale;

public interface Bank {

	String getInterest(double principal, double rate, int termInYears);
	
	default String formatPrint(double value) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		return formatter.format(value);
	}
	
	default double percentToDecimal(double value) {
		return value / 100;
	}
	
}
