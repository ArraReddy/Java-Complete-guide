package com.r177219050.q2;

public class BankInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is from bank interface");

		Bank.database();

		Bank RAM = new Bank();
		RAM.BankCredit(150);
		RAM.BankDebit(1000);
		RAM.BalanceDisplay();

	}

}
