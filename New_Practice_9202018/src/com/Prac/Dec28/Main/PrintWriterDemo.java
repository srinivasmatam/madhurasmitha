package com.Prac.Dec28.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PrintWriterDemo {

	public static void main(String[] args) throws SecurityException, IOException {
		//Logger log = Logger.getLogger(PrintWriterDemo.class.getName());
		PrintWriter pw = new PrintWriter(new File("Demo.txt"));
		Logger log = Logger.getLogger(PrintWriterDemo.class.getName());
		LogManager.getLogManager().readConfiguration(new FileInputStream("src/logging.properties"));
		
		pw.println("Hi");
		pw.println("Hello");
		pw.println("Welcome");
		//log.setLevel(Level.WARNING);
		log.severe("Written into file");
		log.config("Config File");
		log.info("This is loding loging file which is inside sorce");
		log.warning("This is warning");
		pw.close();
		

	}

}
