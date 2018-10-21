package com.Prac.Extra.Entity;

public class DeepStudent implements Cloneable{

	private String StudentID;
	private String StudentName;
	public DeepCourse course;
	
	
	public DeepStudent(String studentID, String studentName, DeepCourse course) {
		
		this.StudentID = studentID;
		this.StudentName = studentName;
		this.course = course;
	}
	
	
	
	 @Override
	public String toString() {
		return "DeepStudent [StudentID=" + StudentID + ", StudentName="
				+ StudentName + ", course=" + course + "]";
	}



	//Overriding clone() method to create a deep copy of an object.
	public Object Clone() throws CloneNotSupportedException
	{
		
		DeepStudent student = (DeepStudent) super.clone();
		student.course = (DeepCourse) course.Clone();
		
		return student;
		
	}
	
}
