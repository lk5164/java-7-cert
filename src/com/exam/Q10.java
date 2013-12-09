package com.exam;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q10
{

	public static void main(String[] args)
	{
		Path path = Paths.get("C:\\education\\institute\\student\\report.txt");
		System.out.printf("get.Name(0): %s", path.getName(0));
		System.out.printf("subpath(0, 2): %s", path.subpath(0, 2));
	}

}
