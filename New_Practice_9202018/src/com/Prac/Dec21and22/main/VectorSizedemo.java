package com.Prac.Dec21and22.main;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSizedemo {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println("Printint Vector size without passing ");
		System.out.println(v.size());

		v.setSize(10);
		
		System.out.println("Printint Vector size after passing ");
		System.out.println(v.size());
		
		System.out.println("Displaying Firstelement");
		System.out.println(v.firstElement());
		
		System.out.println("Displaying Lastelement");
		System.out.println(v.lastElement());
		
		/*Enumeration ele = v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}*/
		
	}

}
