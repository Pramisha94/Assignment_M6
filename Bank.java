package com.assignment;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amount;
		ChkBalance c=new ChkBalance(2000);
		while(true)
		{
			System.out.println("**********************************");
			System.out.println("1. Withdraw");
			System.out.println("2. Check Balance");
			System.out.println("3. Exit");
			System.out.println("**********************************");
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			System.out.println("**********************************");
		if(choice==1)
		{
			System.out.println("Enter withdrawal Amount : ");
			amount=sc.nextDouble();
			try {
				c.withdraw(amount);
			}
			catch (CustException e)
			{
				System.out.println("Sorry, insufficient balance, you need more "+e.getAmount()+" Rs. to perform this transaction.");
			}
			System.out.println("**********************************");
		}
		else if(choice==2)
		{
			c.checkbalance();
			System.out.println("**********************************");
		}
		else if(choice==3)
		{
			System.out.println("Thank You");
			System.out.println("**********************************");
			break;
		}
		else
		{
			System.out.println("Invalid choice");
			System.out.println("**********************************");
			}
		}

	}

}
