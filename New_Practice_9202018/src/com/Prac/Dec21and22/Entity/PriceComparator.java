package com.Prac.Dec21and22.Entity;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductClone>{

	@Override
	public int compare(ProductClone o1, ProductClone o2) {
		// TODO Auto-generated method stub
		return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));
	}

}
