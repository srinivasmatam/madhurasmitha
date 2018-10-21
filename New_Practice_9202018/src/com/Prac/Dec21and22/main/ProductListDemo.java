package com.Prac.Dec21and22.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import com.Prac.Dec21and22.Entity.ProductClone;

public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ProductClone> products = new ArrayList<>();
		products.add(new ProductClone("p123","pen",5.50,new Date()));
		products.add(new ProductClone("p124","pencil",6.59,new Date()));
		products.add(new ProductClone("p125","Ruler",2.50,new Date()));
		products.add(new ProductClone("p126","Book",10.00,new Date()));
		
		//Collections.sort(products);
		
		/*for (ProductClone product : products) {
			
			System.out.println(product);
		}*/
		
		
		ListIterator<ProductClone> list = products.listIterator();
		System.out.println("Display in Asending order");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("Display in Descending order");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		
		
	}

}
