package com.r177219050.q3;

public class Counter implements Runnable {
	
	
	public static int cnt=155;
	public synchronized  void task() 
	{
		
		System.out.println("Thread ID: "+Thread.currentThread().getId()+"            value :"+cnt);			
		
		
			
		cnt=cnt+1;
			
			
	}
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		task();
	}

}
