package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.ITALIAN);
		Locale currentLocale = Locale.getDefault();
		ResourceBundle resBundle = ResourceBundle.getBundle("com.localization.ResourceBundle", currentLocale);
		System.out.println(resBundle.getString("Greeting"));

	}

}
