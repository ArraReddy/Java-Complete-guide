package com.r177219050.q2;

public class OddNumber extends Thread{
	
	public void task() 
	{
		
		for(int i=0;i<10;i++)
		{
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			if(i%2!=0)
			System.out.println("Thread name: "+"OddNumber "+"            count :"+i);			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		task();
	}
	

}
