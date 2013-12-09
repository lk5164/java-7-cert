package com.localization;

import java.text.NumberFormat;
import java.text.ParseException;

public class FractionDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] numbers = { "1.222", "0.456789F" };
//		Float[] floats = { 1.222F, 0.456789F };
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		for (String number : numbers) {
//			Float num = Float.parseFloat(number);
			try {
				System.out.println(numberFormat.parse(number));
			} catch (ParseException pe) {
				System.out.println("Failed parsing " + number);
			}
		}

	}

}
