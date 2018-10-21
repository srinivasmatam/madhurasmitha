package com.Prac.Dec21and22.main;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.Prac.Dec21and22.Entity.EmployeeQueue;
import com.Prac.Dec21and22.Entity.Salarycomparator;



public class PriorityQueueWithComparator {

	public static void main(String[] args) {
		
		PriorityQueue<EmployeeQueue> pqueue = new PriorityQueue<>(5, new Salarycomparator());
		
		pqueue.offer(new EmployeeQueue("smitha",10000));
		pqueue.offer(new EmployeeQueue("madhu",12000));
		pqueue.offer(new EmployeeQueue("bollu",9876));
		pqueue.offer(new EmployeeQueue("srini",11200));
		pqueue.offer(new EmployeeQueue("pravni",13980));
		
		Iterator i = pqueue.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}

	}

}
