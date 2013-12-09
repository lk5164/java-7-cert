/**
 * 
 */
package com.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Path path1 = Paths.get("src\\com\\nio\\Test.txt");
		Path path2 = Paths.get("F:\\myfiles\\PROJECTS\\workspace\\java-7-cert\\src\\com\\nio\\Test.txt");
		// comparing two paths using compareTo() method
		System.out.println("(path1.compareTo(path2) == 0) is: " + (path1.compareTo(path2) == 0));
		//comparing two paths using equals() method
		System.out.println("path1.equals(path2) is: " + path1.equals(path2));
		
//		System.out.println("path1's path: "+path1.toAbsolutePath()+". Path2's path: "+path2.toAbsolutePath());
		// comparing two paths using equals() method with absolute path
		System.out.println("path2.equals(path1.toAbsolutePath()) is "
		+ path2.equals(path1.toAbsolutePath()));
	}

}
