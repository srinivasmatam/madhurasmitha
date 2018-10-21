package com.Prac.Dec26.Entity;

public class Student {
	
	private String stuID;
	private String StuName;
	private String grade;
	
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Student(String stuID, String stuName) {
		
		this.stuID = stuID;
		this.StuName = stuName;
		
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", StuName=" + StuName + ", grade="
				+ grade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StuName == null) ? 0 : StuName.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((stuID == null) ? 0 : stuID.hashCode());
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
		if (StuName == null) {
			if (other.StuName != null)
				return false;
		} else if (!StuName.equals(other.StuName))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (stuID == null) {
			if (other.stuID != null)
				return false;
		} else if (!stuID.equals(other.stuID))
			return false;
		return true;
	}
	
	
	
	

}
