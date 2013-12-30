package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q125 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (BufferedReader buffIn = new BufferedReader(new FileReader(
				"res\\com\\exam\\myfile.txt"))) {
			String line = "";
			int count = 1;
			buffIn.mark(1);
			line = buffIn.readLine();
			System.out.println(count + ": " + line);
			line = buffIn.readLine();
			count++;
			System.out.println(count + ": " + line);
			buffIn.reset();
			line = buffIn.readLine();
			count++;
			System.out.println(count + ": " + line);
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
