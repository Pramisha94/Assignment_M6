package com.assignment;

public class Printpattern5 {
public static void main(String[] args) {
	
	int i,j;
	for (i= 0;i<=3; i++)  
	{  
		for (j=0;j<=i;j++)   
		{  
			System.out.print("*"+ " ");  
		}   
			System.out.println("");   
	}   
	for (i=3;i>=0;i--)  
	{  
		for(j=0;j<=i-1;j++)  
		{  
			System.out.print("*"+ " ");  
		}  
			System.out.println("");  
	}  
	}  
	}  