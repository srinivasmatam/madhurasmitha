package com.Prac.Dec21and22.main;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3,5);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.add(60);
		v.add(23);
		v.add(12);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.add(61);
		v.add(24);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Enumeration ele = v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
	}

}
