package com.Prac.Extra.Main;

import com.Prac.Extra.Entity.DeepCourse;
import com.Prac.Extra.Entity.DeepStudent;

public class DeepCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCourse course = new DeepCourse("Maths","Science","Social");
		
		DeepStudent student = new DeepStudent("S123","Smitha",course);
		DeepStudent student1 = (DeepStudent) student.Clone();
		
		System.out.println(student);
		System.out.println(student1);
		
		System.out.println(student.course.Subject1);
		student1.course.Subject1="Hindi";
		System.out.println(student.course.Subject1);

	}

}
