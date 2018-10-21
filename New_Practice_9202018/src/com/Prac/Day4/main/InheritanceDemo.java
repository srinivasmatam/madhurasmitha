package com.Prac.Day4.main;

import com.Prac.Day4.Entity.Doctor;
import com.Prac.Day4.Entity.Surgeon;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor d = new Surgeon(null);
		Surgeon s = new Surgeon(null);
		d.treatpatient();
		s.treatpatient();
		s.incision();
		
	}

}
