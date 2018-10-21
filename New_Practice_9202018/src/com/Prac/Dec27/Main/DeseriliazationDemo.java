package com.Prac.Dec27.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Prac.Dec27.Entity.Product;

public class DeseriliazationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("Data1.txt");
		ObjectInputStream bin = new ObjectInputStream(fin);
		Product product = null;
		product = (Product)bin.readObject();
		System.out.println(product);
        bin.close(); fin.close();
	}

}
