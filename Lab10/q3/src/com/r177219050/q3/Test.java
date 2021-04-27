package com.r177219050.q3;

public class Test {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter obj=new Counter();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		Thread t5=new Thread(obj);
		Thread t6=new Thread(obj);
		Thread t7=new Thread(obj);
		Thread t8=new Thread(obj);
		Thread t9=new Thread(obj);
		Thread t10=new Thread(obj);
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
	}

}
