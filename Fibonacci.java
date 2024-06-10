package com.assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int i, n,nextTerm;
		int firstTerm = 0, secondTerm = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms for Fibonacci series :");
		n=sc.nextInt();
		for(i=0;i<n;i++) 
		{
	         System.out.print(firstTerm + " ");
	         nextTerm = firstTerm + secondTerm;
	         firstTerm = secondTerm;
	         secondTerm = nextTerm;
	}
		System.out.println("Fibonacci series up to " + n + " terms:");
	}
	}

