package com.exam;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q147 {

	public static void main(String[] args) {
		Path dir = Paths.get("/home/hsu/workspaceJava7/java-7-cert/src/com/exam");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir,
				"*.{java, htm,jar}")) {
			for (Path entry : stream) {
				System.out.println(entry.getFileName());
			}
		} catch (IOException e) {
//			System.err.println("Caught IOException: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
