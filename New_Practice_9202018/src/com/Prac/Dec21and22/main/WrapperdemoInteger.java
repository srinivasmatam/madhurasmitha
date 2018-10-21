package com.Prac.Dec21and22.main;

public class WrapperdemoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		Integer intobj = new Integer(i);//Boxing
		int d = intobj.intValue(); //Unboxing
		
		System.out.println(d);
		System.out.println(intobj.doubleValue());
		System.out.println(intobj);
		
		int x=90;
		Integer xobj=x; //Autoboxing
		int changeval=xobj;//Auto-Unboxing
	}

}
