package com.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path p1=Paths.get("res\\com\\exam\\faculty\\q100.txt");
		Path p2 = Paths.get("res\\com\\exam\\student\\q100.txt");
		try {
			Files.move (p1, p2,
					StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
