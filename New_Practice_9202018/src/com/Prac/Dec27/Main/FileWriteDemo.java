package com.Prac.Dec27.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("File1.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.setReadOnly());
		FileWriter fw = new FileWriter("File1.txt");
		fw.write("This is File Writer Demo");
		fw.close();

	}

}
