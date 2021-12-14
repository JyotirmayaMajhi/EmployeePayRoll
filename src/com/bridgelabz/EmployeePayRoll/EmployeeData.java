package com.bridgelabz.EmployeePayRoll;

public class EmployeeData {

	int ID;
	String name;
	double Salary;
	
	public EmployeeData(int iD, String name, double salary) {
		super();
		this.ID = iD;
		this.name = name;
		this.Salary = salary;
	}

	@Override
	public String toString() {
		
		return "EmployeeData [id=" + ID + ", name=" + name + ", salary=" + Salary + "]";
	}
	
}
