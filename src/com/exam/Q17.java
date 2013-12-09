package com.exam;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("\\sales\\quarter\\..\\qtrlreport.txt");
		path.relativize(Paths.get("\\sales\\annualreport.txt"));
		if (path.endsWith("annualreport.txt")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println(path);
	}

}
