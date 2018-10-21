package com.Prac.Dec30.Entity;

public class DuplicateIdFoundException extends Exception{

	String message;

	public DuplicateIdFoundException() {
		this.message = "Given product Id already exists in List";
	}

	public DuplicateIdFoundException(String message) {
		
		this.message = message;
	}

	@Override
	public String toString() {
		return "DuplicateIdFoundException [message=" + message + "]";
	}
	
	public String getMessage()
	{
		return this.message;
		
	}
	
	
}
