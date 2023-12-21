package Module2;

//Write a Java program to Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class Greast_N0 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter The Second Number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Third Number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is Largest.");
		}
		if(b>a && b>c)
		{
			System.out.println("B is Largest.");
		}
		if(c>a && c>b)
		{
			System.out.println("C is Largest");
		}
	}
}
