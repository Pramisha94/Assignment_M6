package com.assignment;

import java.util.Scanner;

public class MaxminArray12 {
	public static void main(String[] args) {
		int size;
		int i,max=0,min=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size=sc.nextInt();
		int a[]= new int[size];
		for(i=0;i<size;i++)
			{
				System.out.print("A["+i+"]=");
				a[i]=sc.nextInt();
			}
		min = a[0];
		for(i=0;i<size;i++)
		{
			if(a[i]>max)
				{
					max = a[i];
				}
			else if(a[i]<min)
				{
					min =a[i];
					temp =min;
				}			
		}
		System.out.println("Maximum in array : "+max);
		System.out.println("Minimum in array : "+min);
	}
}
	