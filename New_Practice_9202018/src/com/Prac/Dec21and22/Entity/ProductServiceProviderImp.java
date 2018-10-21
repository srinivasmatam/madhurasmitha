package com.Prac.Dec21and22.Entity;

import java.util.ArrayList;
import java.util.List;

import com.Prac.Dec21and22.Entity.IproductServiceprovider;
import com.Prac.Dec21and22.Entity.ProductClone;

public class ProductServiceProviderImp implements IproductServiceprovider{
	
	List<ProductClone> productlist=new ArrayList<>();
	@Override
	public boolean add(ProductClone products)throws DuplicateIdFoundException {
		boolean flag=false;
		productlist.add(products);
		flag=true;
		return flag;
	}

	@Override
	public ProductClone getProductIdBy(String productId) throws ProductNotFoundException{
		ProductClone productresult=null;
		boolean flag=false;
		for(ProductClone productclone : productlist)	
		{
			if(productclone.getProductId().equals(productId))
			{
				productresult=productclone;
				flag=true;
			}
		}
		if(!flag)
		{
			throw new ProductNotFoundException("Product Id is not found in list");
		}
		return productresult;
	}

	@Override
	public List<ProductClone> getProducts() {
		
		return productlist;
	}

	@Override
	public boolean updateprice(String productId, double price) throws ProductNotFoundException{
		boolean flag=false;
		for (ProductClone productClone : productlist)
		{
		 if(productClone.getProductId().equals(productId))	
		 {
			 productClone.setPrice(price);
			 flag=true;
			 break;
		 }
		}
		return flag;
	}

	@Override
	public boolean delete(String productId)throws ProductNotFoundException {
		boolean flag=false;
		for (ProductClone productClone : productlist) 
		{
		 if(productClone.getProductId().equals(productId))	
			 productlist.remove(productClone);
		 flag=true;
		 break;
		}
		return flag;
	}

}
