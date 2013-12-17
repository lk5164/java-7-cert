package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DOSFileAttr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("src\\com\\nio\\Test.txt");
		try{
			Files.setAttribute(path,"dos:hidden", true);
			Files.setAttribute(path,"dos:readonly", true); 
			DosFileAttributes attr = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println(attr.size());
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
