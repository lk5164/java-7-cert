package com.localization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PatternStringExample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String pattern = "E";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
		Date today = new Date();
		System.out.println(formatter.format(today));

	}

}
