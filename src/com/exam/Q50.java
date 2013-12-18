package com.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName1 = "res\\com\\exam\\myfile.txt";
		String fileName2 = "res\\com\\exam\\newfile.txt";
		try (BufferedReader buffIn = new BufferedReader(new FileReader(
				fileName1));
				BufferedWriter buffOut = new BufferedWriter(new FileWriter(
						fileName2))) {
			String line = "";
			int count = 1;
			line = buffIn.readLine();
			while (line != null) {
				buffOut.write(count + ": " + line);
				buffOut.newLine();
				count++;
				line = buffIn.readLine();
			}
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
