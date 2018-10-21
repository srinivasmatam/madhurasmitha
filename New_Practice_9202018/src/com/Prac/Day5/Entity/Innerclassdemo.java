package com.Prac.Day5.Entity;

import com.Prac.Day5.Entity.Outerclass;
import com.Prac.Day5.Entity.Outerclass.Innerclass;


public class Innerclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outerclass out = new Outerclass();
		out.showAge();
		Innerclass inobj=out.new Innerclass();
		inobj.getAge();
		

	}

}
