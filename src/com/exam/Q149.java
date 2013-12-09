package com.exam;

import java.io.FileInputStream;
import java.io.IOException;

public class Q149 {
	public void otherMethod() {
		printFile("");
	}

	public void printFile(String file) {
		try (FileInputStream fis = new FileInputStream(file)) {
			System.out.println(fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Q149().otherMethod();

	}

}
