package com.exam;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q67 {
	public static void main(String[] args) {
		String fileName = "myfile.txt";
		try (BufferedReader buffIn = // Line 4
		new BufferedReader(new FileReader(fileName))) {
			String line = "";
			int count = 1;
			line = buffIn.readLine(); // Line 7
			do {
				line = buffIn.readLine();
				System.out.println(count + ": " + line);
			} while (line != null);
		} catch (IOException /*| FileNotFoundException*/ e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
