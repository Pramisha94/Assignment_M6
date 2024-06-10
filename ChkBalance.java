package com.assignment;

public class ChkBalance {

	double balance;
	
	public ChkBalance(double balance) {
	this.balance=balance;
	System.out.println("Account Balance : "+balance);
	}
	public void withdraw(double amount)throws CustException
	{
		if(amount<=this.balance)
		{
			this.balance = this.balance-amount;
		}
		else
		{
			throw new CustException(amount - this.balance);
		}
	}
	public void checkbalance()
	{
		System.out.println("Current Balance :"+this.balance);
	}
		
	}

