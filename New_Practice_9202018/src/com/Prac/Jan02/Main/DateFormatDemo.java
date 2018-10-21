package com.Prac.Jan02.Main;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.FRENCH);
		Date d = new Date();
		System.out.println(df.format(d));
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT,Locale.FRENCH);
		//Date d = new Date();
		System.out.println(df1.format(d));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","IN"));
		//Date d = new Date();
		System.out.println(df2.format(d));

	}

}
