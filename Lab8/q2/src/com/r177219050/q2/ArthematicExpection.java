package com.r177219050.q2;

import java.util.Scanner;

public class ArthematicExpection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the two numbers");
			num1=s.nextInt();
			num2=s.nextInt();
			
			
			
			try {
				System.out.println(num1+"/"+num2+"="+num1/num2);
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Divisor cannot be zero "+e);
				System.out.println("Try again");
			}
		}
		
		
		

	}

}
