package com.Prac.Dec18.main;

import java.util.Date;

import com.Prac.Dec18.Entity.ProductClone;

public class Cloneabledemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
     ProductClone pc = new ProductClone("p123","Eraser",3.45,new Date());
     ProductClone pc1 = (ProductClone) pc.clone();
     
     System.out.println(pc);
     System.out.println(pc1);
	}

}
