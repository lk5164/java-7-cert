package com.exam;

import java.io.FileReader;
import java.io.IOException;

public class Q150 {

	public void ReadFile(String source) {
		char[] c = new char[128];
		int cLen = c.length;
		try (FileReader fr = new FileReader(source)) {
			int count = 0;
			int read = 0;
			while ((read = fr.read(c)) != -1) {
				count += read;
			}
			System.out.println("Read: " + count + " characters.");
		} catch (IOException i) {
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
