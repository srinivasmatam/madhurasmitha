package com.Prac.Extra.Entity;

public class DeepCourse implements Cloneable{

	public String Subject1;
	private String Subject2;
	private String Subject3;
	
	public DeepCourse(String subject1, String subject2, String subject3) {
		
		this.Subject1 = subject1;
		this.Subject2 = subject2;
		this.Subject3 = subject3;
	}
	
	
	
	@Override
	public String toString() {
		return "DeepCourse [Subject1=" + Subject1 + ", Subject2=" + Subject2
				+ ", Subject3=" + Subject3 + "]";
	}



	public Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
