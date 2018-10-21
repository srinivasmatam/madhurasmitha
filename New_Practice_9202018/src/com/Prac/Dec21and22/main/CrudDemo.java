package com.Prac.Dec21and22.main;

import java.util.Date;

import com.Prac.Dec18.Entity.Product;
import com.Prac.Dec21and22.Entity.DuplicateIdFoundException;
import com.Prac.Dec21and22.Entity.ProductClone;
import com.Prac.Dec21and22.Entity.ProductNotFoundException;
import com.Prac.Dec21and22.Entity.ProductServiceProviderImp;

public class CrudDemo {

	public static void main(String[] args) throws ProductNotFoundException {
		ProductServiceProviderImp service = new ProductServiceProviderImp();
		
		try {
			System.out.println(service.add(new ProductClone("p123","pen",5.50,new Date())));
		} catch (DuplicateIdFoundException e1) {
			
			System.out.println(e1);
		}
		try {
			System.out.println(service.add(new ProductClone("p124","pencil",6.59,new Date())));
		} catch (DuplicateIdFoundException e1) {
			System.out.println(e1);
		}
		try {
			System.out.println(service.add(new ProductClone("p125","Ruler",2.50,new Date())));
		} catch (DuplicateIdFoundException e1) {
			System.out.println(e1);
		}
		try {
			System.out.println(service.add(new ProductClone("p126","Book",10.00,new Date())));
		} catch (DuplicateIdFoundException e1) {
			System.out.println(e1);
		}
		
		try {
			System.out.println(service.add(new ProductClone("p126","crayon",10.00,new Date())));
		} catch (DuplicateIdFoundException e1) {
			System.out.println(e1);
		}
		
		System.out.println("Displying product List corresponding to productsId");
		try {
			System.out.println(service.getProductIdBy("p12"));
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("Displying product List");
		
		
		try {
			System.out.println(service.updateprice("p124", 20.02));
		} catch (ProductNotFoundException e) {
			
			System.out.println(e);
		}
		System.out.println(service.getProducts());
		
		
		
	}

}
