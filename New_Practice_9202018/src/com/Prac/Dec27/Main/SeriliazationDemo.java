package com.Prac.Dec27.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.Prac.Dec27.Entity.Product;

public class SeriliazationDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Data1.txt");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		Product product = new Product("p123","Pen",5.45,new Date());
		bout.writeObject(product);
		bout.close();fout.close();

	}

}
