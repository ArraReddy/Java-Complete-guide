package com.r177219050.q5;

public class Employee {
	
	public static void NameValidation(String name) throws NameInvallid
	{
		try {
			Integer temp=new Integer(name);
			throw new NameInvallid();
		}catch (NameInvallid e) {
			// TODO: handle exception
			throw e;
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void AgeValidation(int age) throws AgeInvallid
	{
		if(age>50)
			throw new AgeInvallid();
	}
	
		
	public Employee(String name,int age) {
		// TODO Auto-generated constructor stub
		int flag=1;
		try {
			NameValidation(name);
		} catch (NameInvallid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=0;
			
		}
		try {
			AgeValidation(age);
		} catch (AgeInvallid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=0;
		}finally {
			if(flag==1)
				System.out.println("Employee object created");
			else
				System.out.println("Employee object not created");
		}
				
	}

}
