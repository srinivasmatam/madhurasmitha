package com.Prac.Dec21and22.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.Prac.Dec21and22.Entity.NameComparator;
import com.Prac.Dec21and22.Entity.PriceComparator;
import com.Prac.Dec21and22.Entity.ProductClone;

public class ProductCloneListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ProductClone> products = new ArrayList<>();
		products.add(new ProductClone("p123","Earser",5.50,new Date()));
		products.add(new ProductClone("p124","Pencil",6.59,new Date()));
		products.add(new ProductClone("p125","Ruler",2.50,new Date()));
		products.add(new ProductClone("p126","Book",10.00,new Date()));
		
		Collections.sort(products, new NameComparator());
		
		System.out.println("Displying List based on Name sort");
		for (ProductClone productClone : products) {
			
			System.out.println(productClone);
		}
		
		Collections.sort(products, new PriceComparator());
		System.out.println("Displying List based on Price sort");
		for (ProductClone productClone : products) {
			
			System.out.println(productClone);
		}
		

	}

}
