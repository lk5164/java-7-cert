package com.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q99 {
	private static String REGEX = "\\Sto\\S|\\bo\\b";
	private static String INPUT = "Nice to see you,to,be fine.";
	private static String REPLACE = ",";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}
}
