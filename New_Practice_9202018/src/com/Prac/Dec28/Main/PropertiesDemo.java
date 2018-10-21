package com.Prac.Dec28.Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/db.properties");
		Properties pr = new Properties();
		pr.load(fr);
		System.out.println(pr.getProperty("server"));
		System.out.println(pr.getProperty("host"));
		System.out.println(pr.getProperty("user"));
		System.out.println(pr.getProperty("password"));
	}

}
