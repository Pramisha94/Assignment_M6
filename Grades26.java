package com.assignment;

import java.io.InputStream;
import java.util.Scanner;

public class Grades26 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks : ");
		a=sc.nextInt();
		if(a<=40)
			{
				System.out.println("Grade : Fail");
			}
		else if(a<=50)
			{
				System.out.println("Grade : DD");
			}
		else if(a<=60)
			{
				System.out.println("CD");
			}
		else if(a<=70)
			{
				System.out.println("BC");
			}
		else if(a<=80)
			{
				System.out.println("BB");
			}
		else if(a<=90)
			{
				System.out.println("AB");
			}
		else if(a<=100)
			{
				System.out.println("AA");
			}
	}

}
