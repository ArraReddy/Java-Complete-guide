package com.r177219050.q1;

import java.util.Scanner;

public class NumComb {
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		int num[]=new int[3];
		
		System.out.println("enter number of elements in range of 0-9");
		for(int i=0;i<3;i++)
		{
			num[i]=s.nextInt();
		}
		
		for(int dig1=0;dig1<3;dig1++)
		{
			for(int dig2=0;dig2<3;dig2++)
			{
				for(int dig3=0;dig3<3;dig3++)
				{
					System.out.println(num[dig1]*100+num[dig2]*10+num[dig3]);
				}
			}
		}
	}

}

