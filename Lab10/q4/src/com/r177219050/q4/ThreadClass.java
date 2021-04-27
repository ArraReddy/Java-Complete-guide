package com.r177219050.q4;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadClass extends Thread{
	
	String name;
	
	public ThreadClass(String name) 
	{
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
			LocalTime localTime = LocalTime.now();
			System.out.println("Thread ID: "+name+"            count :"+i+"   Time:"+localTime);			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		task();
	}

}
