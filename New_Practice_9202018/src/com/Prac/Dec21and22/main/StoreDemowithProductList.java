package com.Prac.Dec21and22.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import com.Prac.Dec21and22.Entity.ProductClone;
import com.Prac.Dec21and22.Entity.Store;

public class StoreDemowithProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store ABCstore = new Store("S12","ABCStore",null);
		
		List<ProductClone> products= new ArrayList<>();
		products.add(new ProductClone("p123","pen",5.50,new Date()));
		products.add(new ProductClone("p124","pencil",6.59,new Date()));
		products.add(new ProductClone("p125","Ruler",2.50,new Date()));
		products.add(new ProductClone("p126","Book",10.00,new Date()));
		
		ABCstore.setProducts(products);
		
		System.out.println(ABCstore);

	}

}
