package com.exam;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Q82 extends SimpleFileVisitor<Path>{
	private final PathMatcher matcher;
	Q82(){
		matcher=FileSystems.getDefault().getPathMatcher("glob:*.{txt,htm,html,xml}");
	}
	void search(Path file){
		Path name = file.getFileName();
		if(name!=null && matcher.matches(name)){
			System.out.println(name);
		}
	}
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
		search(file);
		return FileVisitResult.CONTINUE;
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Files.walkFileTree(Paths.get("res\\com\\exam"), new Q82());

	}

}
