package com.r177219050.q5;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee("Ram",125,200000);
		System.out.println("Employee Name:"+emp1.getName()+" with salary: "+emp1.getSalary());
		emp1.IncrementSalary(5);
		System.out.println("Employee Name:"+emp1.getName()+" with salary: "+emp1.getSalary());
		
		
		Manager man1=new Manager("Sham",120,5000000);
		man1.setDepartment("Testing");
		System.out.println("manager Name:"+man1.getName()+" with salary: "+man1.getSalary()+" Department: "+man1.getDepartment());
		man1.IncrementSalary(15);
		System.out.println("manager Name:"+man1.getName()+" with salary: "+man1.getSalary()+" Department: "+man1.getDepartment());
		
//		
//		Employee emp2=emp1.clone();
//		emp1.Name="fam";
//		System.out.println(emp2.Empid+emp2.Name);
//		

	}

}
