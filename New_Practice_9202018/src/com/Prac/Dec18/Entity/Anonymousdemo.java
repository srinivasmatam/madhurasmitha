package com.Prac.Dec18.Entity;

public class Anonymousdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVDinterface dvd = new DVDinterface() {
			
			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("This is Anonymouse interface implemented write method");
			}
		};

		dvd.write();
	}

}
