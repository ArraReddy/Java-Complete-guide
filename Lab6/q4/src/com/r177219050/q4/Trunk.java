package com.r177219050.q4;

public class Trunk implements TrunkAcc {

	@Override
	public int ChargeO(int Duration) {
		// TODO Auto-generated method stub
		return Duration*OrdinaryCharge;
	}

	@Override
	public int ChargeU(int Duration) {
		// TODO Auto-generated method stub
		return Duration*UrgentCharge;
	}

	@Override
	public int ChargeL(int Duration) {
		// TODO Auto-generated method stub
		return Duration*LightningCharge;
	}
	

	
}
