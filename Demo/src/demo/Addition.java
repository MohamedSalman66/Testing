package demo;

import java.util.Scanner;

public class Addition
{
	static int x,y,res=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		res=x+y;
		System.out.println("Sum = "+res);
	}
}
