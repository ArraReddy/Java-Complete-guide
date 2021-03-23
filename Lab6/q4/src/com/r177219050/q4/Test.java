package com.r177219050.q4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trunk obj=new Trunk();
		
		Ordinary Person1=obj;
		Urgent Person2=obj;
		Lightning Person3=obj;
		
		System.out.println("Person 1 usage type:"+Person1.type+" Charges: "+Person1.ChargeO(30));
		System.out.println("Person 2 usage type:"+Person2.type+" Charges: "+Person2.ChargeU(30));
		System.out.println("Person 3 usage type:"+Person3.type+" Charges: "+Person3.ChargeL(30));
		
		
		
		

	}

}
