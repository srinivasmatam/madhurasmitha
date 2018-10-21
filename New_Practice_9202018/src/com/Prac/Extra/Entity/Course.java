package com.Prac.Extra.Entity;

import java.util.Arrays;

public class Course {
	
	private String Subject1;
	private String Subject2;
	private String Subject3;
	private Student[] students;
	
	
	public String getSubject1() {
		return Subject1;
	}
	public void setSubject1(String subject1) {
		Subject1 = subject1;
	}
	public String getSubject2() {
		return Subject2;
	}
	public void setSubject2(String subject2) {
		Subject2 = subject2;
	}
	public String getSubject3() {
		return Subject3;
	}
	public void setSubject3(String subject3) {
		Subject3 = subject3;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public Course(String subject1, String subject2, String subject3,
			Student[] students) {
		
		this.Subject1 = subject1;
		this.Subject2 = subject2;
		this.Subject3 = subject3;
		this.students = students;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [Subject1=" + Subject1 + ", Subject2=" + Subject2
				+ ", Subject3=" + Subject3 + ", students="
				+ Arrays.toString(students) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Subject1 == null) ? 0 : Subject1.hashCode());
		result = prime * result
				+ ((Subject2 == null) ? 0 : Subject2.hashCode());
		result = prime * result
				+ ((Subject3 == null) ? 0 : Subject3.hashCode());
		result = prime * result + Arrays.hashCode(students);
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
		Course other = (Course) obj;
		if (Subject1 == null) {
			if (other.Subject1 != null)
				return false;
		} else if (!Subject1.equals(other.Subject1))
			return false;
		if (Subject2 == null) {
			if (other.Subject2 != null)
				return false;
		} else if (!Subject2.equals(other.Subject2))
			return false;
		if (Subject3 == null) {
			if (other.Subject3 != null)
				return false;
		} else if (!Subject3.equals(other.Subject3))
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}
	
	
}
