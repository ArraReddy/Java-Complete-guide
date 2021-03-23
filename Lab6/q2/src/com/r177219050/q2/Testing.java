package com.r177219050.q2;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Players obj=new Players();
		
		Cricket_Player Ram=obj;
		Hockey_Player Sham=obj;
		Football_Player kiran=obj;
		
		System.out.println("Ram  is a "+Ram.location);
		
		System.out.println("Sham is a "+Sham.location);
		
		System.out.println("kiran is a "+kiran.location);
		
		Ram.LocationCricket();
		Sham.LocationHockey();
		kiran.LocationFootball();
		
	}

}
