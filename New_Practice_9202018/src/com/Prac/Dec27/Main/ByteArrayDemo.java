package com.Prac.Dec27.Main;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayDemo {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String str = "This is Byte Array Output Stream Demo";
		
		bout.write(str.getBytes());
		
		bout.writeTo(new FileOutputStream("A1.txt"));
		bout.writeTo(new FileOutputStream("A2.txt"));
		bout.writeTo(new FileOutputStream("A3.txt"));
		bout.flush();
		bout.close();

	}

}
