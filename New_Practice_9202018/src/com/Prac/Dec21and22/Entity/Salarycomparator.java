package com.Prac.Dec21and22.Entity;

import java.util.Comparator;

public class Salarycomparator implements Comparator<EmployeeQueue> {

	@Override
	public int compare(EmployeeQueue o1, EmployeeQueue o2) {
		
		return new Double (o1.getSalary()).compareTo(o2.getSalary());
	}

}
