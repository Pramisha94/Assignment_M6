package com.assignment;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		int size;
		int i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size=sc.nextInt();
		int a[]= new int[size];
		for(i=0;i<size;i++)
			{
				System.out.print("A["+i+"]=");
				a[i]=sc.nextInt();
				sum=sum+a[i];
			}
		System.out.print("Sum of array elements :"+sum);

	}

}
