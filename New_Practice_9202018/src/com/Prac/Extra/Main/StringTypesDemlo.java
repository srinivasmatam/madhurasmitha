package com.Prac.Extra.Main;

public class StringTypesDemlo {

	public static void main(String[] args) {
		  String s = "Java";
		 
		 long starttime = System.currentTimeMillis();
		 for(int i=0;i<10000;i++)
		 {
			 s= s+"J2EE";
		 }
		
		 long Endtime = System.currentTimeMillis();
		 
		 System.out.println("Total Time taken with String Class"+(starttime-Endtime)+"ms");
		 
		 StringBuffer sb = new StringBuffer("Java");
		 
		 long sbstarttime = System.currentTimeMillis();
		 for(int i=0;i<10000;i++)
		 {
			 sb.append("J2EE");
		 }
		 long sbendtime = System.currentTimeMillis();
		 
		 System.out.println("Total Time taken with String Class"+(sbstarttime-sbendtime)+"ms");
		 
		 StringBuilder sbr = new StringBuilder("Java");
		 
		 long sbrstarttime = System.currentTimeMillis();
		 for(int i=0;i<10000;i++)
		 {
			 sbr.append("J2EE");
		 }
		 long sbrEndtime = System.currentTimeMillis();
		 System.out.println("Total Time taken with String Class"+(sbrstarttime-sbrEndtime)+"ms");

	}

}
