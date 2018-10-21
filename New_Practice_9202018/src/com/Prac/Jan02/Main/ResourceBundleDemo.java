package com.Prac.Jan02.Main;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("MessageResource");
		System.out.println("Hi" +"  "+ bundle.getString("Greetings"));
		
		Locale local_Spain = new Locale("es" , "ES");
		ResourceBundle  bundle1 = ResourceBundle.getBundle("MessageResource",local_Spain);
		System.out.println("Hi"+"  "+ bundle1.getString("Greetings"));
		
		Locale local_india= new Locale("en","IN");
		ResourceBundle bundle2 = ResourceBundle.getBundle("MessageResource",local_india);
		System.out.println(bundle2.getString("Greetings"));

	}

}
