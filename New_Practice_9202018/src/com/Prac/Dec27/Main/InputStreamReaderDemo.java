package com.Prac.Dec27.Main;


import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader inr = new InputStreamReader(System.in);
		System.out.println("Enter Any String");
		int a = inr.read();
		
		while(a!=-1)
		{
			System.out.print((char)a);
			a=inr.read();
		}

	}

}
