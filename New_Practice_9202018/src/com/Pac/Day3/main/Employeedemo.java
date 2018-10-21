package com.Pac.Day3.main;

import java.util.Scanner;

import com.Prac.Day3.Entity.Employee;

public class Employeedemo {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<=employees.length-1;i++)
		{
		System.out.println("Enter Employee ID");
		String empId=s.next();
		System.out.println("Enter Employee Name");
		String eName=s.next();
		System.out.println("Enter Employee Department");
		String deptno = s.next();
		System.out.println("Enter Employee Salary");
		double salary = s.nextDouble();
		employees[i]= new Employee(empId,eName,deptno,salary);
		}
		
        System.out.println("Printing Employee Details");
        int i=1;
        for (Employee employee : employees) {
        	
        	
        	System.out.println("Employee Details" +i);
        			
        	System.out.println(employee.getEmpId());
        	System.out.println(employee.geteName());
        	System.out.println(employee.getDeptno());
        	System.out.println(employee.getSalary());
        	i++;
			
		}
	}

}
