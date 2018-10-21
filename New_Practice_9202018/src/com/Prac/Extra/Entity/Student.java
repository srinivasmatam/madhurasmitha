package com.Prac.Extra.Entity;

public class Student implements Cloneable{
	
	private String StudentID;
	private String StudentName;
	private String course;
	
	
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(String studentID, String studentName, String course) {
		super();
		this.StudentID = studentID;
		this.StudentName = studentName;
		this.course = course;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName="
				+ StudentName + ", course=" + course + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((StudentID == null) ? 0 : StudentID.hashCode());
		result = prime * result
				+ ((StudentName == null) ? 0 : StudentName.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentID == null) {
			if (other.StudentID != null)
				return false;
		} else if (!StudentID.equals(other.StudentID))
			return false;
		if (StudentName == null) {
			if (other.StudentName != null)
				return false;
		} else if (!StudentName.equals(other.StudentName))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		return true;
	}
	
	
	public Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}

}
