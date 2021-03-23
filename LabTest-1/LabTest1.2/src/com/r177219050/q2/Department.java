package com.r177219050.q2;

public class Department implements Cloneable{

	private String Dname;
	private int DId;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public int getDId() {
		return DId;
	}
	public void setDId(int dId) {
		DId = dId;
	}
	public Department(String dname, int dId) {
		super();
		Dname = dname;
		DId = dId;
	}
	
	public void printble()
	{
		System.out.printf("Department name:"+Dname+" Id: "+DId+"\n");
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
		
}
