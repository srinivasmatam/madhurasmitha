package com.Prac.Dec18.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Prac.Dec18.Entity.Product;
import com.Prac.Dec18.Entity.Store;


//HAS A RELATIONSHIP
public class Storedemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Store abcstr = new Store("S123","ABC Store",null);
		Product products[]={new Product("p123","pen",5.50,new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("12-08-1981 11:48:55")),
				           new Product("p124","pencil",6.59,new Date()),
				           new Product("p125","Ruler",2.50,new Date()),
				           new Product("p126","Book",10.00,new Date())
		};
		abcstr.setProducts(products);
		System.out.println("Store ID" +abcstr.getStoreId());
		System.out.println("Stroe Name" +abcstr.getStorename());
		System.out.println("Product ID\tProduct Name\tPrice\tManifacture Date");
		for (Product product : products) {
			System.out.println();
			System.out.print(product.getProductId()+"\t\t");
			System.out.print(product.getProductdesc()+"\t\t");
			System.out.print(product.getPrice()+"\t\t");
			System.out.print(product.getManfdate()+"\t\t");
			System.out.println();
			
			
		}
	}

}
