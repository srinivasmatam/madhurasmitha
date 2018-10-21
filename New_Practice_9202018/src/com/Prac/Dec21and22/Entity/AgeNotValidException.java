package com.Prac.Dec21and22.Entity;

public class AgeNotValidException extends Exception{
	String cause;
	public AgeNotValidException()
	{
		this.cause="Age is not Valid";
	}

	public AgeNotValidException(String cause)
	{
		this.cause=cause;
	}

	@Override
	public String toString() {
		return "AgeNotValidException [cause=" + cause + "]";
	}
	
	public String getMessage()
	{
		return cause;
	}
}
