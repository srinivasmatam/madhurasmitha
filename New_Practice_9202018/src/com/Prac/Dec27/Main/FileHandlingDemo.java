package com.Prac.Dec27.Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fout = new FileOutputStream("Out.txt",true);
//		
//		fout.write("This is My Frist File Handling Program".getBytes());
//		fout.flush();
		
		
		
		FileOutputStream fout = new FileOutputStream("F:\\Madhurasmitha Learning and Experience Docs\\Out.txt",true);
		fout.write("Writing to Out File".getBytes());
		fout.flush();
		fout.close();
		
//		FileInputStream fin = new FileInputStream("Out.txt");
//		int Character;
//		
//		while((Character=fin.read())!=-1)
//		{
//			System.out.print((char)Character);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Out.txt")));
		System.out.print(br.readLine());

	}

}
