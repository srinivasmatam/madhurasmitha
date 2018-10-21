package com.Prac.Dec30.Entity;

import java.util.Arrays;
import java.util.List;

public class Store {
	
	private String storeId;
	private String storename;
	private List<ProductClone> products;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public List<ProductClone> getProducts() {
		return products;
	}
	public void setProducts(List<ProductClone> products) {
		this.products = products;
	}
	public Store(String storeId, String storename, List<ProductClone> products) {
		super();
		this.storeId = storeId;
		this.storename = storename;
		this.products = products;
	}
	public Store() {
		super();
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storename=" + storename
				+ ", products=" + products + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((products == null) ? 0 : products.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result
				+ ((storename == null) ? 0 : storename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (storeId == null) {
			if (other.storeId != null)
				return false;
		} else if (!storeId.equals(other.storeId))
			return false;
		if (storename == null) {
			if (other.storename != null)
				return false;
		} else if (!storename.equals(other.storename))
			return false;
		return true;
	}
	
	
	

}
