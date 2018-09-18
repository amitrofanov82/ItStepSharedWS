package lesson22.examples;

import java.math.BigDecimal;

public class BigDecimalExample {
	//2,2360679774997896964091736687313
	public static void main(String[] args) {
		double rootFive = Math.sqrt(5);
		BigDecimal base = new BigDecimal("5.2360679774997896964091736687313");
		BigDecimal currentValue = base;
		System.out.println(1+ ": " + currentValue);
		for (int i = 2; i <=30; i++) {
			currentValue = currentValue.multiply(base);
			System.out.println(i+ ": " + currentValue);
		}
		
	}
}
