package com.Prac.Dec21and22.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;



public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //ArrayList of General means not specific type
		/* List l = new ArrayList();
		 l.add(90);
		 l.add("Hello");
		 l.add(10.78);
		 l.add('s');
		 
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			Object value =i.next();
			System.out.println(value);
		}
			
	
		 //System.out.println(l); */
		
		List<Integer> l = new ArrayList<>();
		List<Integer> CopyList = new ArrayList<>();
		
		CopyList.add(100);
		CopyList.add(14);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		//l.remove(new Integer(40));
		l.remove(1);
		l.add(1, 13);
		CopyList.addAll(2, l);
		Collections.sort(CopyList);
		
				/*Iterator i = l.iterator();
				while(i.hasNext())
				{
					int value = (Integer)i.next()+10;
					System.out.println(value);
				}*/
				
		System.out.println("Displying Using For loop");
		
				for (Integer integer : CopyList) {
					System.out.println(integer);
				}
				
		//System.out.println(l);
	}

}
