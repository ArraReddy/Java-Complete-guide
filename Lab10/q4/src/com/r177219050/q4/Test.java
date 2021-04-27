package com.r177219050.q4;

import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Current time:"+localTime);
		
		ThreadClass t1=new ThreadClass("t1");
		ThreadClass t2=new ThreadClass("t2");
		ThreadClass t3=new ThreadClass("t3");
		ThreadClass t4=new ThreadClass("t4");
		ThreadClass t5=new ThreadClass("t5");
		
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		
		try {
			t4.sleep(1000);
			System.out.println("t4 sleeping");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t5.sleep(10000);
			System.out.println("t5 sleeping");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
