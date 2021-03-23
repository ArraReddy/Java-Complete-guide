package com.r177219050.q2;

public class Employee implements Cloneable {
	
	
	private int Id;
	private String Name;
	private Department dep;
	
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee(int Id, String Name,Department dep) {
		
		this.Id = Id;
		this.Name = Name;
		this.dep=dep;
	}
	
	public void printble()
	{
		System.out.printf("Employee name:"+Name+" Id: "+Id+""
				+ " of department: "+dep.getDname()+" with DId: "
				+dep.getDId()+"\n");
		
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee tempEmp=(Employee)super.clone();
		tempEmp.setDep((Department) tempEmp.getDep().clone());
		
		
		return tempEmp;
	}
	
	
	
	
	
	
	

	

}
