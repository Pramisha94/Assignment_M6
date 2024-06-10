package com.assignment;

import java.io.InputStream;
import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		int a[]= {21,58,8,56,2,87};
		int i,element;
		System.out.println("Enter an array element: ");
		Scanner sc =new Scanner(System.in);
		element =sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Index of array element: "+i);
			}
		}
		}

}
