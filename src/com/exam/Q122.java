package com.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q122 {

	public static boolean isContentSame() throws IOException {
		Path p1 = Paths.get("res\\com\\exam\\faculty\\report.txt");
		Path p2 = Paths.get("res\\com\\exam\\student\\report.txt");
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES, LinkOption.NOFOLLOW_LINKS);
		if (Files.isSameFile(p1, p2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		try {
			boolean flag = isContentSame();
			if (flag)
				System.out.println("Equal");
			else
				System.out.println("Not equal");
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		}
	}

}
