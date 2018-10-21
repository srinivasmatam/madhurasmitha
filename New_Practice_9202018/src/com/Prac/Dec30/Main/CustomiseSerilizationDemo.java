package com.Prac.Dec30.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.Prac.Dec30.Entity.Product;

public class CustomiseSerilizationDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("CustomeSer.txt");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		Product product = new Product("p123","Pencil",5.45,new Date());
		bout.writeObject(product);
		bout.close();fout.close();

	}

}
