package com.Prac.Dec30.Entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Date;

public class Product implements Externalizable{
	
	private String productId;
	private transient String productdesc;
	private double price;
	private Date manfdate;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getManfdate() {
		return manfdate;
	}
	public void setManfdate(Date manfdate) {
		this.manfdate = manfdate;
	}
	public Product() {
		super();
	}
	public Product(String productId, String productdesc, double price,
			Date manfdate) {
		super();
		this.productId = productId;
		this.productdesc = productdesc;
		this.price = price;
		this.manfdate = manfdate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productdesc="
				+ productdesc + ", price=" + price + ", manfdate=" + manfdate
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((manfdate == null) ? 0 : manfdate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productdesc == null) ? 0 : productdesc.hashCode());
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
		Product other = (Product) obj;
		if (manfdate == null) {
			if (other.manfdate != null)
				return false;
		} else if (!manfdate.equals(other.manfdate))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productdesc == null) {
			if (other.productdesc != null)
				return false;
		} else if (!productdesc.equals(other.productdesc))
			return false;
		return true;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(productId);
		out.writeObject(productdesc);
		out.writeDouble(price);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		
		productId = (String)in.readObject();
		productdesc = (String)in.readObject();
		price = in.readDouble();
		
	}
	
	

}
