package com.r177219050.q1;

public class CalculatorMain implements Calculator {

	@Override
	public int Div(int num1,int num2) {
		// TODO Auto-generated method stub
		if(num2!=0)
		{
			return num1/num2;
		}
		
		else
		{
		return 0;
		}
	}

	@Override
	public int Mod(int num1,int num2) {
		// TODO Auto-generated method stub
		if(num2!=0)
		{
			return num1%num2;
		}
		
		else
		{
		return -1;
		}
	}
	

}
