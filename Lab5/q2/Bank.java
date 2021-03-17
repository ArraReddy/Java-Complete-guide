package com.r177219050.q2;
class Bank {

	int bal = 10000;

	void BankCredit(int c) {
		
		bal = bal + c;
		
		System.out.println("Your account is creditid with "+c);
		

	}

	void BankDebit(int d) {
		bal = bal - d;
		
		System.out.println("Your account is debited with "+d);

	}

	static void database() {
		System.out.println("You are in a bank database");
	}

	void BalanceDisplay() {
		System.out.println("Your current balance is :" + bal);
	}




}