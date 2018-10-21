package com.Prac.Jan02.Main;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale l = Locale.US;
		System.out.println(l.getDisplayLanguage());
		System.out.println(l.getDisplayVariant());
		System.out.println(l.getISO3Country());
		
		Locale local_india= new Locale("en","IN");
		System.out.println(local_india.getDisplayLanguage());
		System.out.println(local_india.getDisplayVariant());
		System.out.println(local_india.getISO3Country());

	}

}
