package com.exam;

import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class Q52_Finder extends SimpleFileVisitor<Path> {
	private final PathMatcher matcher;
	private static int numMatches = 0;

	Q52_Finder() {
		matcher = FileSystems.getDefault().getPathMatcher("glob:*java");
	}

	void find(Path file) {
		Path name = file.getFileName();
		if (name != null && matcher.matches(name)) {
			numMatches++;
		}
	}

	void report() {
		System.out.println("Matched: " + numMatches);
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		find(file);
		return FileVisitResult.CONTINUE;
	}
}
