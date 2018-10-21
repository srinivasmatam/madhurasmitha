package com.Prac.Extra.Main;

import com.Prac.Extra.Entity.Course;
import com.Prac.Extra.Entity.Student;


public class ShallowCopydemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student = new Student("S123","Smitha","Hindi");
		Student student1 = (Student) student.Clone();
		
//		System.out.println(student1.getStudentID());
//		System.out.println(student1.getStudentName());
//		System.out.println(student1.getCourse());
		
	    student1.setCourse("Maths");
	    System.out.println(student1.getStudentID());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getCourse());
		}
				
				
 		

	}


