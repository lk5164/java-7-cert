package com.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q38 {

	public static void main(String args[]) {
		Path file = Paths.get("./aaa.txt");
		try {
			Files.createFile(file);
			Files.setAttribute(file,"dos:hidden", true);
			Files.setAttribute(file,"dos:readonly", true); 
		} // statements here
		catch (IOException i) {
		}
	}
}
