package com.Prac.Dec26.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserEnteredDate {

	public static void main(String[] args) throws ParseException {
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Date");
		Date userdate = sd.parse(s.next());
		System.out.println(userdate);
		//System.out.println(sd.format(userdate));
		
		Calendar c = new GregorianCalendar();
		c.setTime(userdate);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));

	}

}
