package com.r177219050.q5;

public class Employee implements Cloneable {
	
	String Name;
	int Empid;
	 double Salary;
	
	Employee(String Name,int Emid,double Salary)
	{
		this.Name=Name;
		this.Empid=Emid;
		this.Salary=Salary;
		
		System.out.println("Employee created succesfully");
		
	}
	
	Employee()
	{
		this.Name="";
		this.Empid=0;
		this.Salary=0.0;
	}

	
	
	public String getName() {
		return Name;
	}

	public int getEmpid() {
		return Empid;
	}

	public double getSalary() {
		return Salary;
	}
	
	public void IncrementSalary(double per)
	{
		
		
		Salary=Salary+((per/100)*Salary);
		
		
	}
	
//	@Override
//	protected Employee clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return (Employee)super.clone();
//	}
//	

}
