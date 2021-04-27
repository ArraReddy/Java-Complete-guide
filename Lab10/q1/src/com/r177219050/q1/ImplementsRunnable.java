package com.r177219050.q1;

public class ImplementsRunnable implements Runnable {
	
String name;
	
	public ImplementsRunnable(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;		
	}
	
	public void task() 
	{
		
		for(int i=0;i<5;i++)
		{
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println("Thread name: "+name+"            count :"+i);			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		task();
		
	}


}
