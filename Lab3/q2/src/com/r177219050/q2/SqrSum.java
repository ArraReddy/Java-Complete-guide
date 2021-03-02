package com.r177219050.q2;

import java.util.Scanner;


public class SqrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int num[]=new int[10];
		int sum=0;
		
		System.out.printf("Enter the numbers:");
		for(int i=0;i<10;i++)
		{
			num[i]=s.nextInt();
			sum=sum+(num[i]*num[i]);
		}
		System.out.printf("Sum of Squeare of numbers in an arra is "+ sum);
		

	}

}
