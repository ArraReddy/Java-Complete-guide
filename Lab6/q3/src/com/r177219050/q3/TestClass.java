package com.r177219050.q3;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker obj=new Worker();
		
		SalariedWorker Ram=obj;
		DailyWorker Sham=obj;
		
		
		
		
		System.out.println("Ram is a "+Ram.type+" with weekly wage: "+Ram.ComPay(200));
		System.out.println("Sham is a "+Sham.type+" with weekly wage: "+Sham.ComPay(100, 22));
		
		
	}

}
