package com.Prac.Dec21and22.Entity;

import java.util.Comparator;

public class NameComparator implements Comparator<ProductClone> {

	@Override
	public int compare(ProductClone o1, ProductClone o2) {
		// TODO Auto-generated method stub
		return o1.getProductdesc().compareTo(o2.getProductdesc());
	}

}
