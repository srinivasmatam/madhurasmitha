package com.Prac.Dec21and22.Entity;

import java.util.List;

public interface IproductServiceprovider {
	
	boolean add(ProductClone products)throws DuplicateIdFoundException;
	ProductClone getProductIdBy(String productId)throws ProductNotFoundException;
	List<ProductClone> getProducts();
	boolean updateprice(String productId,double price)throws ProductNotFoundException;
	boolean delete(String productId)throws ProductNotFoundException;
}

