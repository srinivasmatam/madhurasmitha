package com.Prac.Dec21and22.Entity;

public class ProductNotFoundException extends Exception{
	
	String message;

	public ProductNotFoundException() {
		this.message = "Given product is not present in the List";
	}

	public ProductNotFoundException(String message) {
		
		this.message = message;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [message=" + message + "]";
	}
	
	
    public String getMessage()
    {
		return this.message;
    	
    }
}
