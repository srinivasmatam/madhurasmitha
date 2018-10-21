package com.Prac.Extra.Main;

public class SplitandReverseString {

	public static void main(String[] args) {
		
		String s= "I am Madhurasmitha";
		String strarr[] = s.split(" ");
		
					
			StringBuffer sb = new StringBuffer(s);
			System.out.print(sb.reverse().toString());
		
	}

}
