package com.Prac.Dec19.main;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Madhurasmitha";
		String s1=new String("Madhurasmitha");
		String s2="Madhurasmitha";
		String s4 = "Bollu";
		if(s==s2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		char[] ch = new char[10];
		ch=s2.toCharArray();
		System.out.println(ch.length);
		System.out.println(s.length());
	}

}
