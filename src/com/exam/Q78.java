package com.exam;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("it", "IT")); // Set default to Spanish and Spain
		Locale loc1 = Locale.getDefault();
		ResourceBundle message = ResourceBundle.getBundle("com.localization.ResourceBundle", loc1);
		System.out.println(message.getString("Greeting"));
	}

}
