package com.Prac.Dec30.Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceProviderwithDBImp implements IproductServiceprovider{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	List<ProductClone> product = new ArrayList<>();

	@Override
	public boolean add(ProductClone products) throws DuplicateIdFoundException {
		boolean flag=false;
		try{
			con=ConnectDB.getConnection();
			pst=con.prepareStatement("insert into ProductClone values('?'.'?','?','?')");
			pst.setString(1, products.getProductId());
			pst.setString(2, products.getProductdesc());
			pst.setDouble(3, products.getPrice());
			//pst.setDate(4, products.getManfdate());
		int i=pst.executeUpdate();
		if(i>0)
		   flag=true;
		
		}catch (Exception e){
			
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public ProductClone getProductIdBy(String productId)
			throws ProductNotFoundException {
		
		return null;
	}

	@Override
	public List<ProductClone> getProducts() {
		
		return null;
	}

	@Override
	public boolean updateprice(String productId, double price)
			throws ProductNotFoundException {
		boolean flag=false;
		try{
			con=ConnectDB.getConnection();
			pst=con.prepareStatement("update ProductClone set price=? where ProductId=?");
			pst.setDouble(1, price);
			pst.setString(2, productId);
			int i=pst.executeUpdate();
			if(i>0)
			 flag=true;
				
			}catch (SQLException esql)
		{
				esql.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean delete(String productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
