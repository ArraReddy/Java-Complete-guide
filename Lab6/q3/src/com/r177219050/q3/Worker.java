package com.r177219050.q3;

public class Worker implements WorkerAcc {

	@Override
	public int ComPay(int rate, int hours) {
		// TODO Auto-generated method stub
		return rate*hours;
		
	}

	@Override
	public int ComPay(int rate) {
		// TODO Auto-generated method stub
		return rate*40;
		
		
	}


}
