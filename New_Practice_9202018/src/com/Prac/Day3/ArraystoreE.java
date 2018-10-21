package com.Prac.Day3;

public class ArraystoreE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] array = new String[2];
		array[0]="java";
		array[1]=100;
		System.out.println(array[0]);
		System.out.println(array[1]);*/
		
		
		/*Object[] stringArray = new String[5];   //No compile time error : String[] is auto-upcasted to Object[]
        
        stringArray[1] = "JAVA";     
         
        stringArray[2] = 100;*/     //No compile time error, but this statement will throw java.lang.ArrayStoreException at run time
		
		System.out.println(new int[]{1,2,3,4}.length);
		System.out.println(new int[]{12,76,32}[2]);
         

	}

}
