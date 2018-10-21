package com.Prac.Day3.Entity;

public class Employee {
	
	private String empId;
	private String eName;
	private String deptno;
	private double salary;
	
	
	public Employee(String empId, String eName, String deptno, double salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.deptno = deptno;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", deptno="
				+ deptno + ", salary=" + salary + "]";
	}
}
	