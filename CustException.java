package com.assignment;

public class CustException extends Exception {

	double amount;
	public CustException(double amount) {
		this.amount=amount;
		}
	public double getAmount()
	{
		return this.amount;
	}
}