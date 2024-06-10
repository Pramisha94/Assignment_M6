package com.assignment;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int a,i,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a value : ");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial :"+fact);
	}
	}


