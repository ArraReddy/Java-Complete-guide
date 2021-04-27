package com.r177219050.q1;

public class Methord {
	
	public static void main(String[] args) {
		
		//using extends thread
		ExtendedThread obj1=new ExtendedThread("Process_1");
		ExtendedThread obj2=new ExtendedThread("Process_2");
		ExtendedThread obj3=new ExtendedThread("Process_3");
		
		obj1.start();
		obj2.start();
		obj3.start();
		//*********************************************************************
		
		
		//using implements runnable if only class is available
		ImplementsRunnable obj4=new ImplementsRunnable("Process_4");
		ImplementsRunnable obj5=new ImplementsRunnable("Process_5");
				
		Thread objt4=new Thread(obj4);
		Thread objt5=new Thread(obj5);
				
		objt4.start();
		objt5.start();
	}
}
