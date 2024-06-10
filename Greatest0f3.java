package com.assignment;

import java.util.Scanner;

public class Greatest0f3 {

public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a :");
	a=sc.nextInt();
	System.out.print("Enter b :");
	b=sc.nextInt();
	System.out.print("Enter c :");
	c=sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("A is maximum");
		}
		else
		{
			System.out.println("C is maximum");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("B is Maximum");
		}
		else
		{
			System.out.println("C is maximum");
		}
	}
}
}
