package com.exam;

import java.util.Scanner;

public class Q135 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Pastel, *Enamel, Fresco, *Gouache";
		Scanner s = new Scanner(input);
		s.useDelimiter(",\\s*");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
