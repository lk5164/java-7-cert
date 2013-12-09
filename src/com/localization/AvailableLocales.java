package com.localization;

import java.util.Locale;

public class AvailableLocales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The default locale is: " + Locale.getDefault());
		Locale[] locales = Locale.getAvailableLocales();
		System.out.printf(
				"No. of other available locales is: %d, and they are: %n",
				locales.length);
		for (Locale locale : locales) {
			System.out.printf("Locale code: %s and it stands for %s %n",
					locale, locale.getDisplayName());
		}

	}

}
