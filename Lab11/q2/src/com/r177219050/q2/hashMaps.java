package com.r177219050.q2;

import java.util.HashMap;

public class hashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm1=new HashMap<Integer,String>();
		
		hm1.put(25, "Ravi");
		hm1.put(88, "Rob");
		hm1.put(57, "Eve");
		hm1.put(63, "don");
		
		//Specific key exist or not
		System.out.println("Contains 58: "+hm1.containsKey(58));
		System.out.println("Contains 88: "+hm1.containsKey(88));
		
		System.out.println("*******************************************************");
		
		//Specific value exist or not
		System.out.println("Contains Ram: "+hm1.containsValue("Ram"));
		System.out.println("Contains Eve: "+hm1.containsValue("Eve"));
		
		System.out.println("*******************************************************");
		
		//Get all keys 
		System.out.println(hm1.keySet());
		
		System.out.println("*******************************************************");
		
		//get key-values
		for(Integer it:hm1.keySet())
		{
			System.out.println("Key :"+it+" Value: "+hm1.get(it));
		}
		
		System.out.println("*******************************************************");

		
		

	}

}
