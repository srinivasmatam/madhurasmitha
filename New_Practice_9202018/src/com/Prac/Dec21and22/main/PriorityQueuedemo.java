package com.Prac.Dec21and22.main;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuedemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		
		pqueue.offer(10);
		pqueue.offer(2);
		pqueue.offer(19);
		pqueue.offer(11);
		pqueue.offer(91);
		pqueue.offer(45);
		pqueue.offer(20);
		
//		System.out.println("Displaying Element as a List");
//		Iterator i = pqueue.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		

		System.out.println(pqueue.remove());
		System.out.println(pqueue.remove());
		System.out.println(pqueue.remove());
		System.out.println(pqueue.remove());
		System.out.println(pqueue.remove());
	}

}
