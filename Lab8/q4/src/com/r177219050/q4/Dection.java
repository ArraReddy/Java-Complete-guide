package com.r177219050.q4;

public class Dection extends Throwable {
	
	public void CarDire(char car1,char car2) 
	{
		if (car1==car2)
		{
			System.out.println("No collision occures");
		}
		else
		{
			try {
				throw new CarCollision("Demo");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
		}
	}

}
