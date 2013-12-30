package com.exam;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q139 {
	
	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("com.localization.ResourceBundle", Locale.US);
		System.out.println(resource.getObject("HELLO_MSG"/*1*/));
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Q139().loadResourceBundle();
	}

}
