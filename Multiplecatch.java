package com.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplecatch {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.print("Enter a : ");
			a=sc.nextInt();
			System.out.print("Enter b : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Divison : "+c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception caught : "+e);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Exception caught : "+e);
		}

}
}
