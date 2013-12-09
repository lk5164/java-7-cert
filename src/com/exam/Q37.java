package com.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Q37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM", Locale.UK);
		System.out.println("Result:" + sdf.format(new Date()));

	}

}
