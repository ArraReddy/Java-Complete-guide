package com.r177219050.q1;

import java.util.*;



public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lis1=new ArrayList<Integer>();
		lis1.add(255);
		lis1.add(582);
		lis1.add(846);
		lis1.add(865);
		
		
		//Reading using Iterator
		Iterator<Integer> it1=lis1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("**************************************************");
		

		//Creating duplicate object 
		
		//shallow Clone
		ArrayList<Integer> ShallCol=new ArrayList<Integer>(lis1);
		System.out.println(ShallCol);
		System.out.println("**************************************************");

		
		
		//Reverse
		ArrayList<Integer> rever=new ArrayList<Integer>();
		Iterator<Integer> it5=lis1.iterator();
		
		Iterator<Integer> it10=lis1.iterator();
		while(it10.hasNext())
		{
			
			rever.add(0,it10.next());
			
		}
		System.out.println("Reserse ArrayList:"+rever);
	}

}
