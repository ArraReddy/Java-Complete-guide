package com.r177219050.q1;

//import java.util.Scanner;

public class StudentDetales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll[]= {228,252,254,554,286,546,200,248,300,358};
		String name[]= {"Kate","Ram","Sham","Rose","Eve","Lee","Leo","Liv","Avi","Ann"};
		
		
		int point=0;
		while(point>-1)
		{
			
			try {
				System.out.println(roll[point]+" "+ name[point]);
				point+=1;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Reached the end ot the array "+e);
				break;
			}
		}
		
		

	}

}
