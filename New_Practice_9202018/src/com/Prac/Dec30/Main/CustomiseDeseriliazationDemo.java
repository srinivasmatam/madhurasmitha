package com.Prac.Dec30.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Prac.Dec30.Entity.Product;

public class CustomiseDeseriliazationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("Customeser.txt");
		ObjectInputStream bin = new ObjectInputStream(fin);
		Product product = null;
		product=(Product)bin.readObject();
		System.out.println(product);
		bin.close();fin.close();

	}

}
