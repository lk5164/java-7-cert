package com.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q52 {
	public static void main(String[] args) throws IOException {
		Q52_Finder finder = new Q52_Finder();
		Files.walkFileTree(Paths.get("F:\\myfiles\\PROJECTS\\certspace\\java-7-cert\\src\\com\\concurrent"), finder);
		finder.report();
	}
}
