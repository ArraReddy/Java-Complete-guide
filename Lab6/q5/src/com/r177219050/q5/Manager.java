package com.r177219050.q5;

public class Manager extends Employee {
	
	String Department;

	
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	
	
	Manager(String Name,int Emid,double Salary)
	{
		this.Name=Name;
		this.Empid=Emid;
		this.Salary=Salary;
		
		System.out.println("Manager created sucessufuly");
		
	}
	
	Manager()
	{
		System.out.println("Please enter valid input");
	}
	

}
